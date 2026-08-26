package day19.classproblems;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Anupam");
        map.put(20, "Yashraj");
        map.put(30, "Anuj");

        System.out.println(map);
    }
}
