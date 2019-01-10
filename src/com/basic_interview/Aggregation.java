/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic_interview;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *  It is a special form of Association where:
    It represents Has-A relationship.
    It is a unidirectional association i.e. a one way relationship. 
    For example, department can have students but vice versa is not possible and thus unidirectional in nature.
    In Aggregation, both the entries can survive individually which means ending one entity will 
    not effect the other entity
 * 
 * @author Vishal
 */
class Student
{
    
    String name;
    int id;
    String dept;

    public Student( String name, int id,String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
    
}
class Department
{
    String name;
    private List<Student> stud;

    public Department(String name, List<Student> stud) {
        this.name = name;
        this.stud = stud;
    }

    public List<Student> getStudent() {
        return stud;
    }
    
}
class Institute
{
  String institutename;
  private List<Department> dept;

    public Institute(String institutename, List<Department> dept) {
        this.institutename = institutename;
        this.dept = dept;
    }
  public int getnumberofStudents()
  {
      int number=0;
      List<Student> st;
      for(Department departments:dept)
      {
          
          st=departments.getStudent();
          for(Student students:st)
          {
              number++;
          }
          
      }
      
      return  number;
  }
}
public class Aggregation {
    public static void main(String[] args) {
        Student s1 = new Student("Mia", 1, "CSE");
        Student s2 = new Student("Priya", 2, "CSE");
        Student s3 = new Student("John", 1, "EE");
        Student s4 = new Student("Rahul", 2, "EE");
         // making a List of 
        // CSE Students.
        List <Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);
         
        // making a List of 
        // EE Students
        List <Student> ee_students = new ArrayList<Student>();
        ee_students.add(s3);
        ee_students.add(s4);
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
        List <Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);
        // creating an instance of Institute.
        Institute institute = new Institute("BITS", departments);
        System.out.print("Total students in institute: ");
        System.out.println(institute.getnumberofStudents());
        System.out.println("Departments are");
        departments.stream().forEach(e-> System.out.print(e.name+" "));
  
        String version = Runtime.class.getPackage().getImplementationVersion();
        System.out.println(version);
        
    }
}
/*
Total students in institute: 4
Departments are
CSE EE 1.8.0_91
*/

