package Homework.HW12;

public class Main {

    public static void main(String[] args) {
        Book warAndPeace = new Book("Война и мир", "Лев", "Толстой", 1865);
        System.out.printf("Наименование книги - %s \nАвтор - %s %s \nГод публикации %s",warAndPeace.getBookName() ,warAndPeace.getAuthorName(), warAndPeace.getAuthorSurname(), warAndPeace.getYearPublicBook());
        System.out.println();
        System.out.println();
        Book masterAndMargarita = new Book("Мастер и Маргарита", "Михаил", "Булгаков", 1966);
        System.out.printf("Наименование книги - %s \nАвтор - %s %s \nГод публикации %s", masterAndMargarita.getBookName(),masterAndMargarita.getAuthorName(),masterAndMargarita.getAuthorSurname(), masterAndMargarita.getYearPublicBook());
        masterAndMargarita.setYearPublicBook(1967);
        System.out.println();
        System.out.println();
        System.out.printf("Наименование книги - %s \nАвтор - %s %s \nГод публикации %s", masterAndMargarita.getBookName(),masterAndMargarita.getAuthorName(),masterAndMargarita.getAuthorSurname(), masterAndMargarita.getYearPublicBook());
    }
}