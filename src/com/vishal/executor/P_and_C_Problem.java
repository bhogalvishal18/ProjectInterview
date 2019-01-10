/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vishal.executor;

/**
 *
 * @author Vishal
 */
class Q
{
    int id;
    boolean valueset=false;
    public synchronized void getId() {
        while(!valueset)
        {
            try {
                wait();
            } catch (Exception e) {
            }
        } 
        System.out.println("Get    :"+id);
        valueset=false;
        notify();
    }

    public synchronized void  setId(int id) {
        while(valueset)
        {
            try {
                wait();
            } catch (Exception e) {
            }
        }        
        System.out.println("Put    :"+id);
        this.id = id;
        valueset=true;
        notify();
    }

   

   
    
}
class Producer implements Runnable
{
    Q p;

    public Producer(Q p) {
        this.p = p;
        Thread t=new Thread(this,"Producer");
        t.start();
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int i=0;
        while (true) {            
           p.setId(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    
    
    }
    
}
class Consumer implements Runnable
{
    Q c;

    public Consumer(Q c) {
        this.c = c;
        Thread t=new Thread(this,"Consumer");
        t.start();
    }
    
    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while (true) {            
            c.getId();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    
    }
    
}
public class P_and_C_Problem {
    public static void main(String[] args) {
    Q obj=new Q();
    new Producer(obj);
    new Consumer(obj);  
    }
    
}
