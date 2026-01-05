package com.hashmapandhashingfunction.customhashmap;

public class HashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("Apple", 100);
        map.put("Banana", 50);
        map.put("Orange", 80);

        System.out.println(map.get("Apple"));   // 100
        System.out.println(map.get("Banana"));  // 50

        map.remove("Banana");
        System.out.println(map.get("Banana"));  // null
    }
}
