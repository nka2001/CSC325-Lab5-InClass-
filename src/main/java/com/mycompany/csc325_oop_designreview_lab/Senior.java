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
    private String hasCredits;
    /**
     * constructor for senior class, sets parameters to variables
     *
     * @param name
     * @param age
     * @param credits
     */
    public Senior(String name, int age, int credits) {
        super(name, age);
        setCredits(credits);
    }

    /**
     * toString for senior class, returns the super class's toString, as well as
     * the address, GPA, and number of credits
     *
     * @return
     */
    public String toString() {
        String str = "Student Info:  " + super.toString() + ", Address: " + super.getAddress() + ", GPA: " + super.getGpa() + ", Credits: " + credits + " education level: " + hasCredits;

        return str;
    }

    /**
     * sets the credits IF they are greater than 85
     *
     * @param cred
     */
    public void setCredits(int cred) {
        if (cred < 85) {
            hasCredits = "not a senior";
            this.credits = cred;
            
        } else {
            hasCredits = " Is a senior";
            this.credits = cred;
        }

    }

    /**
     * returns the credits
     *
     * @return
     */
    public int getCredits() {
        return credits;
    }

}
