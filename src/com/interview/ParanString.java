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
public class ParanString {
     public static void main(String[] args) {

        //String s = FilterBrackets("{()()()()(((((())))))()()()}()()()()()");
        // System.out.println(s);
         String s="[{()()()()(((((())))))()()()}()()()()()]";
        while ((s.length()!=0) && (s.contains("[]")||s.contains("()")||s.contains("{}")))
        {
        //System.out.println(s.length());
        //System.out.println(s);
        s = s.replace("[]", "");
        s = s.replace("()", "");
        s = s.replace("{}", "");
        }

        if(s.length()==0)
        {
            System.out.println("Well Formed");
        }
        else
        {
            System.out.println("Not Well Formed");
        }
    }

    public static String FilterBrackets(String str)
    {
        int len=str.length();
        char arr[] = str.toCharArray();
        String filter = "";
        for (int i = 0; i < len; i++)
        {
            if ((arr[i]=='(') || (arr[i]==')') || (arr[i]=='[') || (arr[i]==']') || (arr[i]=='{') || (arr[i]=='}'))
            {
                filter=filter+arr[i];
            }
        }
        return filter;
    }
}
