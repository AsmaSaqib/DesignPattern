/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author sp20-bse-072
 */
public class Test {
     public static void main(String[] args) {
     StudentEncapsulation student=new StudentEncapsulation();
     student.setStudentID(72);
     student.setProgram("BSE");
     student.setStudentName("Abubakr");
         System.out.println("StudentID: "+student.getStudentID());
          System.out.println("Student Name: "+ student.getStudentName());
          System.out.println("Student Program: "+ student.getProgram());
     }
}
