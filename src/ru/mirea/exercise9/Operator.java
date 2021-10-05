package ru.mirea.exercise9;

public class Operator implements  EmployeePosition {
    double damages=Math.random() * (20000);
    @Override
    public String getJobTitle(){
        return "Operator";
    }

    public double calcSalary(double baseSalary) {
        return baseSalary-damages;
    }
}
