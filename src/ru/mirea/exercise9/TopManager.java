package ru.mirea.exercise9;
public class TopManager implements EmployeePosition{
    double impact= 1+Math.random() * (2);
    @Override
    public String getJobTitle(){
        return "Top manager";
    }

    public double calcSalary(double baseSalary) {
            return baseSalary*impact;

    }
}
