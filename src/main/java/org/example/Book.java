package org.example;

public class Book {

    private final String title;
    private final String author;
    private final boolean available;
    private Person currentHolder;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
        this.currentHolder = null;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public Person getCurrentHolder() {
        return currentHolder;
    }

    public void setCurrentHolder(Person person) {
        this.currentHolder = person;
    }

    public Person showPerson() {
        return currentHolder;
    }

}

