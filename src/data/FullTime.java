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
public class FullTime extends Professor{
    private float salary;

    public FullTime(String id, String name, Date hiringDate, String school, String department, float salary) {
        super(id, name, hiringDate, school, department);
        this.salary = salary;
    }

    @Override
    public float paySalary(){
        return this.salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    

    

    
           
    
}
