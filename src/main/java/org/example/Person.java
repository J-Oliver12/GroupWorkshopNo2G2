package org.example;
import java.util.ArrayList;
import java.util.List;

public class Person {


    private final int personId;
    private final String firstName;
    private final String lastName;
    private final List<Book> booksOnLoan;


    public Person(int personID, String firstName, String lastName) {
        this.personId = personID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.booksOnLoan = new ArrayList<>();
    }


    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Book> getBooksOnLoan() {
        return booksOnLoan;
    }

    public void loanBook(Book book) {
        booksOnLoan.add(book);
        book.setCurrentHolder(this);
    }

    public String displayBooks() {
        StringBuilder bookList = new StringBuilder();
        for (Book book : booksOnLoan) {
            bookList.append(book.getTitle()).append(" - ").append("Author: ").append(book.getAuthor()).append("\n");
        }
        return bookList.toString();
    }
}
