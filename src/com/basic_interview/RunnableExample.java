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
public class RunnableExample implements Runnable{

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("Inside :"+Thread.currentThread().getName());
    }
    public static void main(String...k)
    {
        System.out.println("Inside :"+Thread.currentThread().getName());
        RunnableExample obj=new RunnableExample();
        
        System.out.println("Creating Thread");
        Thread thread=new Thread(obj);
        System.out.println("Inside :"+Thread.currentThread().getName());
        System.out.println("Starting Thread");
        thread.start();
    }
    
}
/*
Inside :main
Creating Thread
Inside :main
Starting Thread
Inside :Thread-0
*/
