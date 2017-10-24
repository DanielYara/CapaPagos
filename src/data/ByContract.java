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
public class ByContract extends Employee{
    private int months;
    private float value;

    public ByContract(String id, String name, Date hiringDate, int months, float value) {
        super(id, name, hiringDate);
        this.months = months;
        this.value = value;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public float paySalary() {
        return this.value/this.months;
    }
    
}
