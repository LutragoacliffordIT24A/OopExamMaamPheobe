/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Student {
    
    private int student_Id;
    private String name;
    public int getId(){
        return student_Id;
    }
    public void setId(int sid){
        this.student_Id = sid;
    }
    public String getName(){
            return name;
    }
    public void setName(String sname){
        this.name = sname;
    }
}
class main{
    public static void main(String [] args ){
        Student s = new Student();
        s.setId(27);
        s.setName("Tom Jones");
        System.out.println("Student Data: " + "\nStudent Id: " + s.getId() + "\nStudent Name: "  + s.getName());
    }
}