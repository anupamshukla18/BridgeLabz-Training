package day20.classproblems;

import java.util.*;
import java.util.function.Consumer;


class NumberCollection implements Iterable<Integer> {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < arr.length;
            }

            @Override
            public Integer next() {
                return arr[index++];
            }
        };
    }

}

public class CustomIterable {
    public static void main(String[] args) {
        NumberCollection s = new NumberCollection();

        for (int i : s.arr) {
            System.out.println(i);
        }
    }
}
