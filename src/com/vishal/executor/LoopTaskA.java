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
public class LoopTaskA implements Runnable{
    private static int count=0;
    private int id;
    @Override
    public void run()
    {
         System.out.println("##<TASK "+id+">START##");
        for(int i=10;i>0;i--)
        {
           
              System.out.println("<TASK-"+id+">Tick tick"+i);
            try
            {
              Thread.sleep((long)Math.random()*1000);
            
            }catch(Exception e)
            {
                e.printStackTrace();
            }
            System.out.println("**<TASK "+id+">END**"+i);
        }
    }
    public LoopTaskA()
    {
        this.id=++count;
       
    }
    
}
