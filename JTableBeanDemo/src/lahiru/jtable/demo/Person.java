/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lahiru.jtable.demo;

import java.util.LinkedList;

/**
 *
 * @author Lahiru Ruhunage
 */
public class Person {
    
    private String name;
    private int age;
    private String nationality;
    private String status;

    public Person(String name, int age, String nationality, String status) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.status = status;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
     
    
}
