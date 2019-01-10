/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic_interview;

/**      /Employee  1
 *      /
 * Bank/------Employee  2
 *     \
 *      \Employee  3
 * 
 * One To many
 * @author Vishal
 * 
 * Association is relation between two separate classes which establishes through their Objects.
 * Association can be one-to-one, one-to-many, many-to-one, many-to-many.
 * 
 */
class Bank
{
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public String getBankName() {
        return name;
    }
}
class Employee
{
   private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return name;
    }
   
}
public class Association {
    public static void main(String[] args) {
       Bank bn=new Bank("SBI");
       Employee emp=new Employee("Vishal");
       
        System.out.println(emp.getEmployeeName()+" is  a employee of"+bn.getBankName());
       
    }
}
/*
Vishal is  a employee ofSBI
*/