/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Administrative extends Employee{
    private String category;
    private float salary;

    public Administrative(String id, String name, Date hiringDate, String category, float salary) {
        super(id, name, hiringDate);
        this.category = category;
        this.salary = salary;
    }
    
    
    @Override
    public float paySalary() {
        return this.salary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
}
