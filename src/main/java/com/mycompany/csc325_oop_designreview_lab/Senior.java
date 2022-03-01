/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author nicka
 */
public class Senior extends Student {
    private int credits;
    
    public Senior(String name, int age, int credits){
        super(name, age);
        setCredits(credits);
    }
    
    
    public String toString(){
        String str = "Student Info:  " + super.toString() + ", Address: " + super.getAddress() + ", GPA: " + super.getGpa() + ", Credits: " + credits;
      
        return str;
    }
    public void setCredits(int cred){
        if(cred < 85){
            credits = 0;
        }else{
            this.credits = cred;
        }
        
    }
    
    
}
