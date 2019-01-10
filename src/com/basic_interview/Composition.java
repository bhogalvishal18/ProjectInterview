/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic_interview;

import java.util.ArrayList;
import java.util.List;

/**
 *
Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.

It represents part-of relationship.
In composition, both the entities are dependent on each other.
When there is a composition between two entities, the composed object cannot exist without the other entity.

 * @author Vishal
 */
class Book
{
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
}
class Library
{
    private  List<Book> books;

    public Library(List<Book> books) {
        this.books=books;
    }

    public List<Book> getBooks() {
        return books;
    }
    
}
public class Composition {
    public static void main(String[] args) {
        // Creating the Objects of Book class.
        Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2 = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");
         
        // Creating the list which contains the 
        // no. of books.
        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        Library lib=new Library(books);
        List<Book> bks=lib.getBooks();
        bks.stream().forEach(e->System.out.println(e.title));
    }
}
