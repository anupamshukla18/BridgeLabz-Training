package day16.classproblems;

public class GenericMethod {
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " " );
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] integerArray = {1,2,3,4};
        printArray(integerArray);
        String[] stringArray = {"Anupam", "Yashraj", "Anuj"};
        printArray(stringArray);
    }
}
