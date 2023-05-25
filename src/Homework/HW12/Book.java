package Homework.HW12;

public class Book {
    private Author author;
    private String name;
    private int yearPublicBook;

    public Book(String name, Author author, int yearPublicBook) {
        this.author = author;
        this.name = name;
        this.yearPublicBook = yearPublicBook;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublicBook() {
        return this.yearPublicBook;
    }

    public void setYearPublicBook(int yearPublicBook) {
        this.yearPublicBook = yearPublicBook;
    }

}
