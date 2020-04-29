import java.util.Scanner;
import java.lang.Math;
class Employee {
    String name;
    String lastname;
    double salary;
    Employee(String name,String lastname, double salary){
        this.name = name;
        this.lastname = lastname;
        if(salary > 0){
            this.salary = salary;
        }
    }

    public void SetName(String name){
        this.name =name;
    }
    public void SetLastname(String lastname){

        this.lastname = lastname;
    }
    public void SetSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }
    }
    public String GetName(){
        return this.name;
    }
    public String GetLastname(){
        return this.lastname;
    }
    public double GetSalary(){
        return this.salary;
    }

}

class Main {
    public static void main(String[] args) {
        Employee number1 = new Employee("John", "Roshan", 50000);
        Employee number2 = new Employee("Johnny", "Nashor", 70000);
        System.out.println("Per Year:" + number1.GetSalary()*12);
        System.out.println("Per Year:" + number2.GetSalary()*12);
        number1.SetSalary(number1.GetSalary()*1.1);
        number2.SetSalary(number2.GetSalary()*1.1);
        System.out.println("Per Year:" + number1.GetSalary()*12);
        System.out.println("Per Year:" + number2.GetSalary()*12);

    }
}