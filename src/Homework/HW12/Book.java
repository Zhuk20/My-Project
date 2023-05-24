package Homework.HW12;

public class Book extends Author {
    private String bookName;
    private int yearPublicBook;

    public Book(String bookName, String authorName, String authorSurname,  int yearPublicBook) {
        super(authorName,authorSurname);
        this.bookName = bookName;
        this.yearPublicBook = yearPublicBook;
    }
    public String getBookName() {
        return this.bookName;
    }

    public int getYearPublicBook() {
        return this.yearPublicBook;
    }

    public void setYearPublicBook(int yearPublicBook) {
        this.yearPublicBook = yearPublicBook;
    }

}
