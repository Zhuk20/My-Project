package Homework;

import java.util.Objects;

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
        if (yearPublicBook > 0) {
            this.yearPublicBook = yearPublicBook;
        }
    }

    public String toString() {
        return "Наименование книги " + this.name + "\nАвтор " + this.author + "\nГод публикации " + this.yearPublicBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublicBook == book.yearPublicBook && Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, yearPublicBook);
    }
}
