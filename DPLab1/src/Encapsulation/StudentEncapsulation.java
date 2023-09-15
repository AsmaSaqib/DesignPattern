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
public class StudentEncapsulation {
    private int StudentID;
    private String StudentName;
    private String Program;

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public int getStudentID() {
        return StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getProgram() {
        return Program;
    }
}
