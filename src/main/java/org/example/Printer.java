package org.example;

public class Printer {

    public static void main(String[] args) {
        Person person1 = new Person(1, "Juan", "Oliver");
        Person person2 = new Person(2, "John", "Doe");

        Book book1 = new Book("Java Programming", "Lexicon");
        Book book2 = new Book("Fullstack Developer", "Lexicon");
        Book book3 = new Book("OPP Lectures" , "Lexicon");

        person1.loanBook(book1);
        person2.loanBook(book2);
        person1.loanBook(book3);

        System.out.println("\n" + person1.getFirstName() + " " + person1.getLastName() + "'s books on loan: ");
        System.out.println(person1.displayBooks());

        System.out.println("Book: " + book2.getTitle() + " - Author: " + book2.getAuthor() + "\nHeld by: " + book2.showPerson().getFirstName() + " " + book2.showPerson().getLastName());
    }

}
