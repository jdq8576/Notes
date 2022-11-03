package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class TestCollections {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        Map<Integer, Integer> synchronizedMap = Collections.synchronizedMap(map);

        final Map<Object, Object> objectObjectMap = Collections.emptyMap();
        /**
         * java.lang.UnsupportedOperationException
         *
         * objectObjectMap.put("123", "123");
         */
        final Map<String, String> stringStringMap = Collections.singletonMap("123", "123");
        /**
         * java.lang.UnsupportedOperationException
         *
         * stringStringMap.put("123", "123");
         */
        final Map<String, String> unmodifiableMap = Collections.unmodifiableMap(stringStringMap);
        /**
         * java.lang.UnsupportedOperationException
         *
         * unmodifiableMap.put("123", "123");
         */
    }
}
