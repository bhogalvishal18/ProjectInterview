/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.designpattern;

/**
 *
 * @author Vishal
 * Builder Pattern builds a complex object using simple object and uses step by step approach
 */
class Phone
{
    private String os;
    private int ram;
    private double screensize;
    private int battery;
    public Phone(String os,int ram,double  screensize,int battery)
    {
        super();
        this.os=os;
        this.ram=ram;
        this.screensize=screensize;
        this.battery=battery;
        
    }
    
    @Override
    public String toString()
    {
        return "Phone[os="+os+",ram="+ram+",screensize="+screensize+",battery="+battery+"]";
    }
}
class PhoneBuilder
{
    private String os;
    private int ram;
    private double screensize;
    private int battery;
    public PhoneBuilder setOS(String os)
    {
        this.os=os;
        return  this;
    }
    public PhoneBuilder setRAM(int ram)
    {
        this.ram=ram;
        return  this;
        
    }
    public PhoneBuilder setScreenSize(double  screensize)
    {
        this.screensize=screensize;
        return  this;
        
    }
    public PhoneBuilder setBattery(int battery)
    {
        this.battery=battery;
        return this;
    }
    public Phone getPhone()
    {
        return new Phone(os,ram,screensize,battery);
    }
}
public class BuilderDesign {
    public static void main(String[] args) {
          Phone ob=new Phone("Android",2,5.6,3300);  //All parameter are compulsory
          System.out.println(ob.toString());
          Phone p= new PhoneBuilder().setOS("IOS").setBattery(5500).getPhone();
          System.out.println(p.toString());
    }

}
