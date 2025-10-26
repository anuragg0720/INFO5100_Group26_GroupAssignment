/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.student;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class StudentModule {
//    private ArrayList<Student> studentlist;
        private List<Student> studentlist = new ArrayList<>();
    
    public StudentModule() {
        this.studentlist = new ArrayList<Student>();
    }
    
    public ArrayList<Student> getstudentlist() {
        return (ArrayList<Student>) studentlist;
    }

    public void setstudentlist(ArrayList<Student> courseList) {
        this.studentlist = courseList;
    }
    
    public Student addnewStudent(){
        Student student = new Student();
        studentlist.add(student);
        return student;
    }
    
    public void deleteStudent(Student student){
        studentlist.remove(student);
    }
    
}
