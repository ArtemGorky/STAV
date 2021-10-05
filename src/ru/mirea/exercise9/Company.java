package ru.mirea.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public double income=(Math.random() * (20000000));
    ArrayList<Employee> people = new ArrayList<Employee>();
    private int c=0;
    void hire(String name,String surname,int baseSalary,String profession){
        people.add(new Employee(name,surname,baseSalary,profession,this));
    }
    void hireAll(){
    }
    void fire(int index){
        people.remove(index);
    }
    double getIncome(){
        return income;
    }
    void getPeople(){
        for (int i=0;i<people.size();i++){
            System.out.println(people.get(i).getSalary()+" "+people.get(i).getName());
        }
    }
    ArrayList<Employee> getTopSalaryStaff(int count){
        ArrayList<Employee> topPeople = new ArrayList<Employee>();
for(int i=0;i<people.size();i++) {
    for (int j = people.size()-1; j > i; j--) {
        if (people.get(j-1).getSalary() < people.get(j).getSalary()) {
            Employee swap = people.get(j-1);
            people.set(j-1, people.get(j));
            people.set(j, swap);
        }
    }
}
    for(int i=0;i<count;i++){
        topPeople.add(people.get(i));
    }
return topPeople;
    }
    ArrayList<Employee> getLowestSalaryStaff(int count){
        ArrayList<Employee> topPeople = new ArrayList<Employee>();
        for(int i=0;i<people.size();i++) {
            for (int j = people.size()-1; j > i; j--) {
                if (people.get(j-1).getSalary() > people.get(j).getSalary()) {
                    Employee swap = people.get(j-1);
                    people.set(j-1, people.get(j));
                    people.set(j, swap);
                }
            }
        }
        for(int i=0;i<count;i++){
            topPeople.add(people.get(i));
        }
        return topPeople;
    }

}
