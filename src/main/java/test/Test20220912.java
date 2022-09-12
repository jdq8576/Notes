package test;

/**
 * @author tim
 * @date 2022/9/12 4:14 下午
 */
public class Test20220912 {
    public static void main(String[] args) {
        System.out.println(0.3 * 1 == 0.3);

        System.out.println(Math.round(-11.5));

        SS ss = new SS();

        ss.method();

        System.out.println(~10);

        int min = Integer.MIN_VALUE;
        int min2 = Integer.MIN_VALUE - 1;

        int max = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE + 1;

        System.out.println(-1 + " : " + Integer.toBinaryString(-1));
        System.out.println(min + " : " + Integer.toBinaryString(min));
        System.out.println(min2 + " : " + Integer.toBinaryString(min2));
        System.out.println(max + " : " + Integer.toBinaryString(max));
        System.out.println(max2 + " : " + Integer.toBinaryString(max2));

        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(-11));
    }
}
