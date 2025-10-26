/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.student;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class ProffratingModule {
    
    private ArrayList<proffrating> ratinglist;
    
    public ArrayList<proffrating> getratingList() {
        return ratinglist;
    }
    
    public void setratingList(ArrayList<proffrating> ratinglist) {
        this.ratinglist = ratinglist;
    }
    
    public proffrating addratinglist(){
        proffrating prorating = new proffrating();
        ratinglist.add(prorating);
        return prorating;
    }
    
    public void deleteProfessorrating(proffrating prorating){
        ratinglist.remove(prorating);
    }    
}
