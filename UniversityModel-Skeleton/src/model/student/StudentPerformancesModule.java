/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.student;

import java.util.ArrayList;

/**
 *
 * @author khune
 */
public class StudentPerformancesModule {
    
    private ArrayList<StudentPerformance> studentperformance;
    
    public StudentPerformancesModule(){
        this.studentperformance = new ArrayList<>();
    }
    
    public ArrayList<StudentPerformance> getperformancelistlist() {
        return studentperformance;
    }
    
    public StudentPerformance addperformanceList(){
        StudentPerformance newperformancelsit = new StudentPerformance();
        studentperformance.add(newperformancelsit);
        return newperformancelsit;
    }
    
    public void deleteperformacelsit(StudentPerformance performance){
        studentperformance.remove(performance);
    }    
    
}
