package com.bookshelflibraryorganizer;

class Book {
    private String title;
    private String author;

    Book(String title, String author) {
        this.title = normalize(title);
        this.author = normalize(author);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    private String normalize(String s) {
        return s.trim().toLowerCase();
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
