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
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
3
This line has junk text.  
121.18.19.20  
2001:0db8:0000:0000:0000:ff00:0042:8329
*/

public class IPAddressValidation {

    public static void main(String[] args)throws IOException
    {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        
      String line;                                           // variable to store IP-addresses
      int N = Integer.parseInt(br.readLine());               // variable to store number of lines
                 
            
      for(int i=0;i<N;++i)
      {
        line="";                // initializing with empty
        line = br.readLine();   // read input
      
        st = new StringTokenizer(line,"."); // ipv4
        
        int val=0;
        boolean ipv4 = false,ipv6 = false;   // variables to indicate whether IP-address is IPv4 or IPv6
        
        while(st.hasMoreTokens())
        {
            try
            {
            val=Integer.parseInt(st.nextToken());   // computing values of every octect
            
            if(val>=0 && val<=255)                  // if value is in range then continue otherwise break
                ipv4=true;
            else
            {
                ipv4=false;
                break;
            }
            }catch(Exception e){
            break;}
        }
        
        if(!ipv4)
        {
            String str = "";
            
            st = new StringTokenizer(line,":"); // ipv6
            while(st.hasMoreTokens())
            {
                str = st.nextToken();
                if(str.matches("^[0-9a-f]{1,4}"))
                    ipv6 = true;
                else
                {
                    ipv6 = false;
                    break;
                }
                    
            }
            
            // displaying appropriate output
            
            if(ipv6)
                System.out.println("IPv6");
            else
                System.out.println("Neither");
        }
        else
        {
            System.out.println("IPv4");
        }
        
      }
    }
}
