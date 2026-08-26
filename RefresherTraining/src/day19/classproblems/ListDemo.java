package day19.classproblems;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(3);
        list.add(12);
        list.add(5);

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.get(1));
    }
}
