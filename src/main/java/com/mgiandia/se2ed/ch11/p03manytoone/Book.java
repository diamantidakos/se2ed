package com.mgiandia.se2ed.ch11.p03manytoone;

public class Book {
    private Publisher publisher;

    public Book() { }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Publisher getPublisher() {
        return publisher;
    }
  
 }