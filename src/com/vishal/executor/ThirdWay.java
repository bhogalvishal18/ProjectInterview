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
public class ThirdWay {
    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run()
    {
        
        for(int i=10;i>0;i--)
        {
            System.out.println("Tick tick"+i);
            try
            {
              Thread.sleep(200);
            
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
        }).start();
                
    }
}
