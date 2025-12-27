package com.constructor.levelone;

public class EBooks extends Books {

    private double fileSize;

    public EBooks(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void showEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN      : " + ISBN);         // public -> accessible
        System.out.println("Title     : " + title);        // protected -> accessible
        System.out.println("Author    : " + getAuthor());  // private -> via getter
        System.out.println("File Size : " + fileSize + " MB");
        System.out.println("--------------------------------");
    }
}
