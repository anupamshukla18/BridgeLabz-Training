package day20.classproblems;

import java.util.*;

class Students {
    String name;
    int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students("Anupam", 22));
        list.add(new Students("Yashraj", 20));

        Comparator<Students> comp1 = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.age - o2.age;
            }
        };

        Comparator<Students> comp2 = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Collections.sort(list,comp1);
        System.out.println(list);

        Collections.sort(list,comp2);
        System.out.println(list);
    }
}
