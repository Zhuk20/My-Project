package Homework.HW12;

import java.io.PrintStream;

public class Main {
    public static void printBookInfo(Book book) {
        System.out.printf("Наименование книги - %s \nАвтор - %s %s \nГод публикации %s", book.getName(), book.getAuthor().getName(), book.getAuthor().getSurname(), book.getYearPublicBook());
        System.out.println();
    }

    public static void main(String[] args) {
        Book warAndPeace = new Book("Война и мир", new Author("Лев", "Толстой"), 1865);
        printBookInfo(warAndPeace);
        Book masterAndMargarita = new Book("Мастер и Маргарита", new Author("Михаил", "Булгаков"), 1966);
        printBookInfo(masterAndMargarita);
        masterAndMargarita.setYearPublicBook(1967);
        printBookInfo(masterAndMargarita);
    }
}