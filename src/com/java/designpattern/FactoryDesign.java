/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.designpattern;

import java.awt.Window;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author Vishal
 * Factory Design pattern defines an interface or abstract class for creating an object but let the subclass 
 * decide which class to instantiate.
 */
interface OS
{
    public void spec();
}
class Android implements OS
{

    @Override
    public void spec() {
       System.out.println("Most Powerful OS"); 
     }
    
}
class IOS implements OS
{

    @Override
    public void spec() {
    
     System.out.println("Most Secure OS");
    }
    
}
class Windows implements OS{

    @Override
    public void spec() {
        
    System.out.println("I'm going to die very soon");
    }
    
}
class OperatingSystemFactory
{
    public OS getInstance(String str)
    {
        if(str.equals("open"))
        {
            return  new Android();
        }
        else if(str.equals("closed"))
        {
            return  new IOS();
        }
        else
            return  new Windows();
    }
}
public class FactoryDesign {
    public static void main(String[] args) {
        OS ob1=new Android();
        ob1.spec();
        OS ob2=new Windows();
        ob2.spec();
        System.out.println("------------------");
        OperatingSystemFactory os=new OperatingSystemFactory();
        OS obj=os.getInstance("open");
        obj.spec();
        
    }
}
