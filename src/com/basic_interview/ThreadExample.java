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
public class ThreadExample extends Thread{
    @Override
    public void run()
    {
        System.out.println("Inside :"+Thread.currentThread().getName());
    }
    public static void main(String...k)
    {
        System.out.println("Inside :"+Thread.currentThread().getName());
        System.out.println("Creating thread...");
        Thread thread = new ThreadExample();
        System.out.println("Starting thread...");
        thread.start();
    }
}
/*
Inside :main
Creating thread...
Starting thread...
Inside :Thread-0
*/