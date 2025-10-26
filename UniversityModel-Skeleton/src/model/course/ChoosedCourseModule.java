/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


import java.util.ArrayList;

/**
 *
 * @author 
 */
public class ChoosedCourseModule {
    
    private ArrayList<ChoosedCourses> choosedcourse;
    
    public ChoosedCourseModule(){
        this.choosedcourse = new ArrayList<>();
    }
    
    public ArrayList<ChoosedCourses> getChoosedcourseslist() {
        return choosedcourse;
    }
    
    public ChoosedCourses addChoosedcourseList(){
        ChoosedCourses newcourselsit = new ChoosedCourses();
        choosedcourse.add(newcourselsit);
        return newcourselsit;
    }
    
    public void deleteCourselsit(ChoosedCourses courses){
        choosedcourse.remove(courses);
    }
    
}
