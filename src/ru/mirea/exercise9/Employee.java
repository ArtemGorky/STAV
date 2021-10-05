package ru.mirea.exercise9;

public class Employee {
    String name;
    String surname;
    int baseSalary;
    Company company;
    EmployeePosition position=new Manager();
    Employee(String name,String surname,int baseSalary,String profession, Company company){
        this.name=name;
        this.surname=surname;
        this.baseSalary=baseSalary;
        this.company=company;
        if(profession=="Manager"){
         position= new Manager();
        }else if (profession == "Top manager"){
          position= new TopManager();
        }else{
         position= new Operator();
        }
    }
   public double getSalary(){
       return position.calcSalary(this.baseSalary);
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
