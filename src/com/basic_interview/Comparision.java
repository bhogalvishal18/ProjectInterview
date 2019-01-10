/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic_interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Vishal
 */
class Movie implements Comparable<Movie>
{
 private double rating;
 private String name;
 private int year;
public double getRating()
{
    return rating;
}
public String getName()
{
   return name;
}
 public int getYear()
 {
     return year;
 }
 public Movie(int year,String name,double rating)
 {
     this.year=year;
     this.name=name;
     this.rating=rating;
 }
    @Override
    public int compareTo(Movie o) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return this.year-o.year;
    }
   
    
}
class A implements Comparator<A>
{

    private double rating;
    private String name;
    private int year;

    public double getRating() {
        return rating;
    }

   

    public String getName() {
        return name;
    }

   

    public int getYear() {
        return year;
    }

   
    public A(int year,String name,double rating)
 {
     this.year=year;
     this.name=name;
     this.rating=rating;
 }
    public A()
    {
        
    }
    @Override
    public int compare(A o1, A o2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    if(o1.rating==o2.rating)
    {
        return 0;
    }else if(o1.rating>o2.rating)
    {
        return 1;
    }
    else
    {
        return -1;
    }
    }
    
}
public class Comparision {
    public static void main(String...k)
    {
        ArrayList<Movie> list=new ArrayList<Movie>();
        list.add(new Movie(2018, "Avenger infinty", 9.8));
        list.add(new Movie(2015,"Force Awakens", 8.3));
	list.add(new Movie(1977,"Star Wars", 8.7));
	list.add(new Movie(1980,"Empire Strikes Back", 8.8));
	list.add(new Movie(1983,"Return of the Jedi", 8.4));
        Collections.sort(list);
        System.out.println("Movies after Sorting by year using Comparable");
        for(Movie movie:list)
        {
            System.out.println(movie.getName()+"   "+movie.getRating()+"   "+movie.getYear());
        }
        List<A> o1=new ArrayList<A>();
        //List<A> o1 = new LinkedList<>();
       
        o1.add(new A(2018, "Avenger infinty", 9.8));
        o1.add(new A(2015,"Force Awakens", 8.3));
	o1.add(new A(1977,"Star Wars", 8.7));
	o1.add(new A(1980,"Empire Strikes Back", 8.8));
	o1.add(new A(1983,"Return of the Jedi", 8.4));
         //List<A> o2=new ArrayList<A>();
        //List<A> o2 = new LinkedList<>();
        //o2.add(new A(1983,"Return of the Jedi", 8.4));
        
        System.out.println("--------------Movies after Sorting  by Rating Coparator-------------");
        Collections.sort(o1,new A());
        for(A movie:o1)
        {
            System.out.println(movie.getName()+"   "+movie.getRating()+"   "+movie.getYear());
        }
    }
}
/*
Movies after Sorting by year using Comparable
Star Wars   8.7   1977
Empire Strikes Back   8.8   1980
Return of the Jedi   8.4   1983
Force Awakens   8.3   2015
Avenger infinty   9.8   2018
--------------Movies after Sorting  by Rating Coparator-------------
Force Awakens   8.3   2015
Return of the Jedi   8.4   1983
Star Wars   8.7   1977
Empire Strikes Back   8.8   1980
Avenger infinty   9.8   2018
*/