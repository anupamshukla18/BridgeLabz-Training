package day14.hackerrankproblems;
import java.io.*;
import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class Novel extends Book {
    void setTitle(String s) {
        System.out.println("The title is: " + s);
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Book b = new Novel();
        b.setTitle(s);
    }
}