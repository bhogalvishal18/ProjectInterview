/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

import java.util.*;

/**
 *
 * @author Vishal
 */
public class CaptializeFirst_letter {
    static String capitalizeSting(String str)
    {
       // Create a char array of given String
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
 
            // If first character of a word is found
            if (i == 0 && ch[i] != ' ' || 
                ch[i] != ' ' && ch[i - 1] == ' ') {
 
                // If it is in lower-case
                if (ch[i] >= 'a' && ch[i] <= 'z') {
 
                    // Convert into Upper-case
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }
 
            // If apart from first character
            // Any one is in Upper-case
            else if (ch[i] >= 'A' && ch[i] <= 'Z') 
 
                // Convert into Lower-Case
                ch[i] = (char)(ch[i] + 'a' - 'A');            
        }
 
        // Convert the char array to equivalent String
        String st = new String(ch);
        return st;
    }
    public static void main(String...k)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input String");
        String input=sc.nextLine();        
        System.out.println(capitalizeSting(input));
    }
}
