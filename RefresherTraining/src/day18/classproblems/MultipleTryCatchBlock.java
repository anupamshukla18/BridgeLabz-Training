package day18.classproblems;

public class MultipleTryCatchBlock {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 0;

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by 0");
        }

        try {
            int[] arr ={1,2,3,4,5,6};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index is unavailable");
        }
        System.out.println("Program executed");
    }
}
