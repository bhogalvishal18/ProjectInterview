/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

/**
 *
 * @author Vishal
 */
import java.util.Arrays;
public class CheckAnagram {
    
    
    static boolean  check(String s1,String s2)
    {
        char[]str1=s1.toCharArray();
        char[]str2=s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return  Arrays.equals(str1, str2);
    }
    static  int countManipulation(String s1,String s2)
    {
        int count=0;
        int char_count[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            char_count[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++)
        {
            //char_count[s1.charAt(i)-'a']++;
            if(char_count[s2.charAt(i)-'a']--<=0)
            {
                count++;
            }
        }
        
        
        return  count;
    }
    public static void main(String[] args) {
        String a="java";
        String b="vaaj";
        System.out.println("Both String are Anagram :"+check(a, b));
        System.out.println("Manipulation required for Anagram :"+countManipulation(a, b));
    }
}
