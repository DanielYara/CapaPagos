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
public class PartialTime extends Professor{
    private String category;
    private int classHours;

    public PartialTime(String id, String name, Date hiringDate, String school, String department, String category, int classHours) {
        super(id, name, hiringDate, school, department);
        this.category = category;
        this.classHours = classHours;
    }

    @Override
    public float paySalary(){
        if(this.category.equals("A"))
            return 60000*this.classHours;
        else if(this.category.equals("B"))
            return 80000*this.classHours;
        else if(this.category.equals("C"))
            return 100000*this.classHours;
        else
            //return 0;
            throw new IllegalArgumentException("Categoria no encontrada.");
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getClassHours() {
        return classHours;
    }

    public void setClassHours(int classHours) {
        this.classHours = classHours;
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
