package day19.classproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NestedCollections {
    public static void main(String[] args) {
        List<Map<String, Integer>> list = new ArrayList<>();
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 90);
        map1.put("C++", 80);
        map1.put("Python", 75);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Java", 100);
        map2.put("C++", 86);
        map2.put("Python", 73);
        list.add(map1);
        list.add(map2);
        System.out.println(list);
    }
}
