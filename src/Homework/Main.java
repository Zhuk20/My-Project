package Homework;

public class Main {

    public static void main(String[] args) {
        Book warAndPeace = new Book("Война и мир", new Author("Лев", "Толстой"), 1865);
        System.out.println(warAndPeace);
        Book masterAndMargarita = new Book("Мастер и Маргарита", new Author("Михаил", "Булгаков"), 1966);
        Book masterAndMargarita1 = new Book("Мастер и Маргарита", new Author("Михаил", "Булгаков"), 1966);
        System.out.println(masterAndMargarita);
        masterAndMargarita.setYearPublicBook(1967);
        System.out.println(masterAndMargarita1);
        if (masterAndMargarita.equals(masterAndMargarita1)) {
            System.out.println("Две книги одинаковы");
        }else{
            System.out.println("Две книги разные");
        }
        System.out.println(masterAndMargarita1.hashCode());
        System.out.println(masterAndMargarita.hashCode());
    }
}