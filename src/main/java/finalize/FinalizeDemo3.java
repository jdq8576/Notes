package finalize;

/**
 * @author tim
 * @date 2022/11/4 09:20
 */
public class FinalizeDemo3 {
    byte[] data = new byte[2048];

    public static void main(String[] args) {
        while (true) {
            new FinalizeDemo3();
        }
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("");
    }
}
