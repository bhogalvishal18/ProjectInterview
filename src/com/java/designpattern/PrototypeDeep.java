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
class Books
{
   private int bksid;

    public int getBksid() {
        return bksid;
    }

    public void setBksid(int bksid) {
        this.bksid = bksid;
    }

    public String getBooksname() {
        return booksname;
    }

    public void setBooksname(String booksname) {
        this.booksname = booksname;
    }
   private String booksname;

    @Override
    public String toString() {
        return "Books{" + "bksid=" + bksid + ", booksname=" + booksname + '}';
    }

    

    
}
class BookShops implements Cloneable
{
    private String shopname;
    List<Books> book=new ArrayList<Books>();
    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public List<Books> getBooks() {
        return book;
    }

    public void setBook(List<Books> book) {
        this.book = book;
    }

    public void load()
    {
        for(int i=0;i<5;i++)
        {
           Books ob=new Books();
           ob.setBksid(i);
           ob.setBooksname("Book "+i);
           this.getBooks().add(ob);
        }
    }
    
    @Override
    public String toString() {
        return "BookShop{" + "shopname=" + shopname + ", book=" + book + '}';
    }

    @Override
    protected BookShops clone() throws CloneNotSupportedException {
       
        BookShops s=new BookShops();
        
        for(Books b: this.getBooks())
        {
            s.getBooks().add(b);
        }
        return s; //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
public class PrototypeDeep {
    public static void main(String[] args) throws CloneNotSupportedException {
       BookShop bshp1=new BookShop();
        bshp1.setShopname("Janta Postak Bhandar");
        bshp1.load();
        System.out.println(bshp1);
        BookShop bshp2=(BookShop) bshp1.clone();
        bshp2.setShopname("Oxford Store");
        bshp2.load();
        bshp1.getBook().remove(2);  
                
        System.out.println(bshp2);
    }
 
}
