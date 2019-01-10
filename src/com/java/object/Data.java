/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.object;

import java.io.Serializable;

/**
 *
 * @author Vishal
 */
public class Data implements Serializable{
  String name;
    int rid;
    static String contact;
    Data(String n, int r, String c)
    {
    this.name = n;
    this.rid = r;
    this.contact = c;
    }  

    
}
