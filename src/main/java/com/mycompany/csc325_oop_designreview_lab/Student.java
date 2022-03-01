package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {

    private double gpa;

    @Override
    /**
     * returns the address, address is stored in the parent class (human)
     *
     * @return address
     */
    public String getAddress() {
        return super.address;
    }

    @Override
    /**
     * sets the address to the address provided as a parameter, address is
     * stored in the parent class (human)
     *
     * @param address
     */
    public void setAddress(String address) {
        super.address = address;
    }

    /**
     * sets the gpa to the gpa provided as a parameter
     *
     * @param gpa
     */
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    /**
     * returns the current gpa for the student
     *
     * @return
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * constructor for Student class, casts age to short and calls the super
     * class's constructor taking two parameters
     *
     * @param name
     * @param age
     */

    public Student(String name, int age) {

        super(name, (short) age);

    }

    /**
     * toString for Student class, returns the name and age in a string
     *
     * @return
     */
    public String toString() {
        String str = "Name: " + super.getName() + " , Age: " + super.getAge();
        return str;
    }

    // ToDo 1: Make this class a child of Human
    // ToDo 2: Fix the resulting errors
    // ToDo 3: Add a field for GPA and create setter and getter
    // ToDo 4: Add comments to your code
}
