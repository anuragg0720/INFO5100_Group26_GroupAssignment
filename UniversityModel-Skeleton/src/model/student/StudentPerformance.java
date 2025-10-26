/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.student;

/**
 *
 * @author 
 */
public class StudentPerformance {
    
    private String uername;
    private String subjectcode;
    private String status;
    private int gpa;
    private String Grade;

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }
    
    

    public String getUername() {
        return uername;
    }

    public void setUername(String uername) {
        this.uername = uername;
    }

    public String getSubjectcode() {
        return subjectcode;
    }

    public void setSubjectcode(String subjectcode) {
        this.subjectcode = subjectcode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    
    
}
