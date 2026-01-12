package com.bookshelflibraryorganizer;

import java.util.*;

class GenreCatalog {
    private LinkedList<Book> books;

    GenreCatalog() {
        books = new LinkedList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(String title) {
        title = title.trim().toLowerCase();

        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.getTitle().equals(title)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public LinkedList<Book> getBooks() {
        return books;
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }
}
