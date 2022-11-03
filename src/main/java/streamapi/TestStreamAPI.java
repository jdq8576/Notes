package streamapi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author tim
 * @date 2022/9/13 10:44 上午
 */
public class TestStreamAPI {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        /**
         * abc
         * bc
         * efg
         * abcd
         * jkl
         */
        filtered.forEach(System.out::println);

        /**
         * 1936531802
         * 1996386053
         * 1382867785
         * 308715022
         * -942330707
         * 82073253
         * -1667069099
         * -1219560105
         * -354509599
         * -839849703
         */
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);


        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        /**
         * 9
         * 4
         * 49
         * 25
         */
        squaresList.forEach(System.out::println);

        List<String> stringss = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        // 获取空字符串的数量r
        long count = stringss.parallelStream().filter(string -> string.isEmpty()).count();
        /**
         * 2
         */
        System.out.println(count);

        List<String> stringsss = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtersed = stringsss.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        String mergedString = stringsss.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        /**
         * 筛选列表: [abc, bc, efg, abcd, jkl]
         * 合并字符串: abc, bc, efg, abcd, jkl
         */
        System.out.println("筛选列表: " + filtered);
        System.out.println("合并字符串: " + mergedString);

        List<Integer> numberss = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numberss.stream().mapToInt((x) -> x).summaryStatistics();
        /**
         * 列表中最大的数 : 7
         * 列表中最小的数 : 2
         * 所有数之和 : 25
         * 平均数 : 3.5714285714285716
         */
        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
    }
}
