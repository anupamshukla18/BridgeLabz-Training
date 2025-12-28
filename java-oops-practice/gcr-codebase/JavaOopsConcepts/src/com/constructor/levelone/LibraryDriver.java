package com.constructor.levelone;

public class LibraryDriver {
    public static void main(String[] args) {

        Books b1 = new Books("ISBN-7777", "Legends of Knowledge", "Mehul Sinha");
        b1.displayBookDetails();

        // Update private author using setter
        b1.setAuthor("Prof. Mehul Sinha");
        b1.displayBookDetails();

        EBooks ebook = new EBooks("ISBN-8888", "Future of Learning", "Nisha Verma", 9.5);
        ebook.showEBookDetails();
        
    }
}
