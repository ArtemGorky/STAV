package ru.mirea.exercise9;

public class Manager implements EmployeePosition {
    double profit=Math.random() * (140000-115000);
    @Override
    public String getJobTitle(){
        return "Manager";
    }

    public double calcSalary(double baseSalary) {
        return baseSalary+profit + 115000;
    }
}
