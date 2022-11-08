package stringpool;

/**
 * @author tim
 * @date 2022/11/4 09:59
 */
public class StringPool {
    public static void main(String[] args) {
        String str1 = new String("hello world!");
        String str2 = "hello world!";
        String str5 = "hello world!";
        System.out.println(str1 == str2);
        System.out.println(str5 == str2);

        String str3 = new String("hello world!");
        String str4 = new String("hello world!");
        System.out.println(str3 == str3);
    }
}
