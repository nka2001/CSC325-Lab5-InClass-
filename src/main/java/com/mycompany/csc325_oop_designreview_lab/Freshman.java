/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author nicka
 */
public class Freshman extends Student{
    
    private int credits;
    public Freshman(String name, int age, int credits){
        super(name, age);
        this.credits = credits;
        
        
    }
    public String toString(){
        String str = "Student Info:  " + super.toString() + ", Address: " + super.getAddress() + ", GPA: " + super.getGpa() + ", Credits: " + credits ;
        return str;
    }
    
    public void setCredits(int cred){
        this.credits = cred;
    }
    
}
