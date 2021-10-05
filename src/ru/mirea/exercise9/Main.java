package ru.mirea.exercise9;

public class Main {

    public static void main(String[] args) {
        Company gazneft = new Company();
        for (int i = 0; i < 180; i++) {
            gazneft.hire("Bob " + i, "Smith", 85000,"Operator");
        }
        for (int i = 0; i < 80; i++) {
            gazneft.hire("John " + i, "Richardson", 110000,"Manager");
        }
        for(int i = 0;i<10;i++)
        {
        gazneft.hire("Tom " + i, "Freeman", 140000,"Top manager");
        }

        for(int i=0;i<3;i++){
            System.out.printf("%.0f",gazneft.getTopSalaryStaff(3).get(i).getSalary());
            System.out.print(" "+gazneft.getTopSalaryStaff(3).get(i).getName()+" "+gazneft.getTopSalaryStaff(3).get(i).getSurname());
            System.out.println();
        }
        for(int i=0;i<3;i++){
            System.out.printf("%.0f",gazneft.getLowestSalaryStaff(3).get(i).getSalary());
            System.out.print(" "+gazneft.getLowestSalaryStaff(3).get(i).getName()+" "+gazneft.getLowestSalaryStaff(3).get(i).getSurname());
            System.out.println();
        }
for(int i=0;i<gazneft.people.size()/4;i++){
    gazneft.fire(i+1);
    gazneft.fire(gazneft.people.size()-i-1);
}
        for(int i=0;i<3;i++){
            System.out.printf("%.0f",gazneft.getTopSalaryStaff(3).get(i).getSalary());
            System.out.print(" "+gazneft.getTopSalaryStaff(3).get(i).getName()+" "+gazneft.getTopSalaryStaff(3).get(i).getSurname());
            System.out.println();
        }
        for(int i=0;i<3;i++){
            System.out.printf("%.0f",gazneft.getLowestSalaryStaff(3).get(i).getSalary());
            System.out.print(" "+gazneft.getLowestSalaryStaff(3).get(i).getName()+" "+gazneft.getLowestSalaryStaff(3).get(i).getSurname());
            System.out.println();
        }
}
}
