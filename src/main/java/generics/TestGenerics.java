package generics;

import java.util.ArrayList;

/**
 * @author tim
 * @date 2022/9/13 10:55 下午
 */
public class TestGenerics {
    public static void main(String[] args) {
        /**
         * Code:
         *       stack=2, locals=3, args_size=1
         *          0: new           #2                  // class java/util/ArrayList
         *          3: dup
         *          4: invokespecial #3                  // Method java/util/ArrayList."<init>":()V
         *          7: astore_1
         *          8: aload_1
         *          9: iconst_1
         *         10: invokestatic  #4                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         *         13: invokevirtual #5                  // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
         *         16: pop
         *         17: aload_1
         *         18: iconst_0
         *         19: invokevirtual #6                  // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
         *         22: checkcast     #7                  // class java/lang/Integer
         *         25: astore_2
         *         26: getstatic     #8                  // Field java/lang/System.out:Ljava/io/PrintStream;
         *         29: aload_2
         *         30: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
         *         33: return
         *       LineNumberTable:
         *         line 11: 0
         *         line 12: 8
         *         line 13: 17
         *         line 14: 26
         *         line 15: 33
         * }
         * SourceFile: "TestGenerics.java"
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        Integer x = list.get(0);
        System.out.println(x);
    }
}
