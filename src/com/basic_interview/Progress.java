/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic_interview;

import java.io.IOException;

/**
 *
 * @author Vishal
 */
class ProgressBar {
    private StringBuilder progress;

    /**
     * initialize progress bar properties.
     */
    public ProgressBar() {
        init();
    }

    /**
     * called whenever the progress bar needs to be updated.
     * that is whenever progress was made.
     *
     * @param done an int representing the work done so far
     * @param total an int representing the total work
     */
    public void update(int done, int total) {
        char[] workchars = {'|', '/', '-', '\\'};
        String format = "\r%3d%% %s %c";

        int percent = (++done * 100) / total;
        int extrachars = (percent / 2) - this.progress.length();

        while (extrachars-- > 0) {
            progress.append('#');
        }

        System.out.printf(format, percent, progress,
         workchars[done % workchars.length]);

        if (done == total) {
            System.out.flush();
            System.out.println();
            init();
        }
    }

    private void init() {
        this.progress = new StringBuilder(60);
    }
}
public class Progress extends ProgressBar{
    public static void main(String[] args) throws InterruptedException, IOException {
    ProgressBar bar = new ProgressBar();

        System.out.println("Process Starts Now!");

        bar.update(0, 1000);
        for(int i=0;i<1000;i++) {
                        // do something!
            for(int j=0;j<10000000;j++)
                for(int p=0;p<10000000;p++);
            // update the progress bar
            bar.update(i, 1000);
        }
        System.out.println("Process Completed!");
        
    }
 
}
