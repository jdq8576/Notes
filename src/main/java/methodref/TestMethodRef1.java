package methodref;

import java.util.ArrayList;
import java.util.List;

public class TestMethodRef1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Google");
        names.add("Taobao");
        names.forEach(System.out::println);
    }
}
