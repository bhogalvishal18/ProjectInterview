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
public class FirstWay {

    public static void main(String[] args) {
        System.out.println("Main thread Start");
        new Firsttask();
        Thread t = new Firsttask();
        System.out.println("Main thread Stop");
    }
}

class Firsttask extends Thread {

    private static int count = 0;
    private int id;

    @Override
    public void run() {

        for (int i = 10; i > 0; i--) {
            System.out.println("<" + id + ">Tick tick" + i);
            try {
                Thread.sleep(200);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Firsttask() {
        this.id = ++count;
        this.start();
    }
}
