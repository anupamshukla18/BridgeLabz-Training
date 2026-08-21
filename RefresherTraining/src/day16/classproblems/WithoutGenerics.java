package day16.classproblems;

import java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add(3);
        list.add(3.345);
        System.out.println(list);
    }
}
