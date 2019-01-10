/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.designpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vishal
 */


class Book 
{
   private int bkid;
   private String bookname;

    

    public int getBkid() {
        return bkid;
    }

    public void setBkid(int bkid) {
        this.bkid = bkid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
   @Override
    public String toString() {
        return "Book{" + "bkid=" + bkid + ", bookname=" + bookname + '}';
    }
}
class BookShop implements Cloneable
{
    private String shopname;
    List<Book> book=new ArrayList<>();

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public void load()
    {
        for(int i=0;i<5;i++)
        {
           Book ob=new Book();
           ob.setBkid(i);
           ob.setBookname("Book "+i);
           getBook().add(ob);
        }
    }
    
    @Override
    public String toString() {
        return "BookShop{" + "shopname=" + shopname + ", book=" + book + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
public class PrototypeShallow {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bshp1=new BookShop();
        bshp1.setShopname("Janta Postak Bhandar");
        bshp1.load();
        
        BookShop bshp2=(BookShop) bshp1.clone();
        bshp2.setShopname("Oxford Store");
        bshp2.load();
        bshp1.getBook().remove(2);  
        System.out.println(bshp1);        
        System.out.println(bshp2);
    }
  
}
