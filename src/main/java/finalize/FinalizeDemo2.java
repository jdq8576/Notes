package finalize;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author tim
 * @date 2022/11/4 09:15
 */
public class FinalizeDemo2 {
    private BufferedReader reader;

    public FinalizeDemo2() {
        InputStream resourceAsStream =
                this.getClass().
                        getClassLoader().
                        getResourceAsStream("Hello.txt");
        reader = new BufferedReader
                (new InputStreamReader(resourceAsStream));
    }

    public void print() {
        reader.lines().forEach(System.out::println);
    }

    @Override
    protected void finalize() throws Throwable {
        if (reader != null) {
            reader.close();
            System.out.println("资源被关闭");
        }
    }

    public static void main(String[] args) {
        new FinalizeDemo2().print();
        System.gc();
    }
}
