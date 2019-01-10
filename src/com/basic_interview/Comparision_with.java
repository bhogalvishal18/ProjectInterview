/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic_interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Vishal
 */
class Person
{
    public int rollno;
    public String name;
    public String address;

    public int getRollno() {
        return rollno;
    }

   

    public String getName() {
        return name;
    }

   

    public String getAddress() {
        return address;
    }

   
    public Person(int rollno,String name,String address)
    {
        this.rollno=rollno;
        this.name=name;
        this.address=address;
               
    }

    public Person() {
    }
    
}
class SortByRoll implements Comparator<Person>
{

    @Override
    public int compare(Person o1,Person o2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   return  o1.rollno-o2.rollno;
    }
    
}
class SortByName implements Comparator<Person>
{

    @Override
    public int compare(Person o1,Person o2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   return  o1.name.compareTo(o2.name);
    }
    
    
}
class SortByAddress extends Person implements Comparable<Person>
{
   // private  SortByAddress ob;
SortByAddress(String address)
    {
      this.address = address;
    }
    @Override
    public int compareTo(Person o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   return this.address.compareTo(o.address);
    }
    
}
public class Comparision_with {
   public static  void main(String...k)
   {
       List<Person> list=new ArrayList<Person>();
       list.add(new Person(111, "aaaa", "Dehradun"));
       list.add(new Person(81, "bbbb", "VikasNagar"));
       list.add(new Person(101, "ccbb", "Doiwala"));
       Collections.sort(list,new SortByRoll());
       System.out.println("-------Sorting By rollno------");
       for(Person ob:list)
       {
           System.out.println(ob.rollno+" "+ob.name+" "+ob.address);
       }
       System.out.println("-------Sorting By Name------");
       Collections.sort(list,new SortByName());
       for(Person ob:list)
       {
           System.out.println(ob.rollno+" "+ob.name+" "+ob.address);
       }
       SortByAddress objk=new SortByAddress("dehradun");
       SortByAddress obj1=new SortByAddress("allahabad");
       SortByAddress obj2=new SortByAddress("gurgaon");
       List<SortByAddress> listt=new ArrayList<SortByAddress>();
       listt.add(objk);
       listt.add(obj2);
       listt.add(obj1);
        Collections.sort(listt);
        for(Person ob:listt)
       {
           System.out.println(ob.rollno+" "+ob.name+" "+ob.address);
       }
       
   }
}
/*
-------Sorting By rollno------
81 bbbb VikasNagar
101 ccbb Doiwala
111 aaaa Dehradun
-------Sorting By Name------
111 aaaa Dehradun
81 bbbb VikasNagar
101 ccbb Doiwala
0 null allahabad
0 null dehradun
0 null gurgaon
*/