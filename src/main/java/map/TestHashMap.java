package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tim
 * @date 2022/9/12 1:13 下午
 */
public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(new Integer(2).hashCode());
        map.put(1, 1);
    }
}
