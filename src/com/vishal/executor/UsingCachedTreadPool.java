/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vishal.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Vishal
 */
public class UsingCachedTreadPool {
    public static void main(String[] args) {
        System.out.println("Main thread Start");
        
         ExecutorService exeSevice= Executors.newCachedThreadPool();
         exeSevice.execute(new LoopTaskA());
          exeSevice.execute(new LoopTaskA());
           exeSevice.execute(new LoopTaskA());
           exeSevice.shutdown();
         System.out.println("Main thread Stop");
    }
    
}
