/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author nicka
 */
public class Freshman extends Student {

    private int credits;//member variable credits, used later

    /**
     * constructor for freshman class, accepts three parameters and sets them
     * accordingly
     *
     * @param name
     * @param age
     * @param credits
     */
    public Freshman(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;

    }

    /**
     * toString for freshman class, returns a string containing the super
     * class's toString, as well as the address, GPA, and credits
     *
     * @return
     */
    public String toString() {
        String str = "Student Info:  " + super.toString() + ", Address: " + super.getAddress() + ", GPA: " + super.getGpa() + ", Credits: " + credits;
        return str;
    }

    /**
     * sets the number of credits
     *
     * @param cred
     */
    public void setCredits(int cred) {
        this.credits = cred;
    }

    /**
     * returns the number of credits
     *
     * @return
     */
    public int getCredits() {
        return credits;
    }

}
