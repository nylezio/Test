package test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: CHNjerry
 * @description: test
 * @date: 2020/03/28 12:32
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>(3);
        map.put("k1", 0.1);
        map.put("k2", 0.2);
        map.put("k3", 0.3);
        System.out.println(map.containsKey("k1"));

    }

}
