/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic_interview;

/**
 *
 * @author Vishal
 */
import java.util.*;
final public class Employee_Immutable
{
 private final String name;
 private final ArrayList addresses;
 public Employee_Immutable(String name, ArrayList addresses) {
 
 this.name = name;
 ArrayList tempAdd=new ArrayList();
 for (int i = 0; i < addresses.size(); i++) {
 tempAdd.add(addresses.get(i));
 }
 this.addresses = tempAdd;
 }

    
 
 public String getName() {
 return name;
 }
 public ArrayList getAddresses() {
 return (ArrayList)addresses.clone();
 }  

    @Override
    public String toString() {
        return "Employee_Immutable{" + "name=" + name + ", addresses=" + addresses + '}';
    }
 
}
class Address
{
    private String country;
    private String state;
    private String addname;

    public Address(String country, String state, String addname) {
        this.country = country;
        this.state = state;
        this.addname = addname;
    }

  
    

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getAddname() {
        return addname;
    }

    @Override
    public String toString() {
        return "Address{" + "country=" + country + ", state=" + state + ", addname=" + addname + '}';
    }

  
    
    
}
class Main
{
    public static void main(String[] args) {
     

        ArrayList<Address> list=new ArrayList<>();
        list.add(new Address("India", "Uttarakhand", "76 Police Line"));
        Employee_Immutable  ob = new Employee_Immutable("Vishal",list);
         System.out.println("------------------");
        System.out.println(ob);
        System.out.println("------------------");
        System.out.println("After Changing");
        ob.getAddresses().add(new Address("Ukraine", "Locardo", "santa luis"));
        System.out.println("------------------");
        System.out.println(ob);
        
        
    }
}
/*
{id:1,name:Vishal}
*/