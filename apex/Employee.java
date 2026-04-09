/*Employee Hierarchy (Single Inheritance)
Create a parent class Employee:
empId
name
salary
method displayDetails()
Create child class Manager:
bonus
method calculateTotalSalary()
Print manager’s final salary.*/

public class Employee{
    int empId,salary;
    void display(){
        System.out.println("EmpId: "+empId+"  Salary: "+salary);
    }

    static void main(String[] args) {
        Manager m = new Manager(52,10000,5000);
        m.display();
        System.out.println("Total Salary with bonus: "+m.calculateTotalSalary());
    }

}
class Manager extends Employee{
    int bonus;
    Manager(int empId,int sal,int bonus){
        this.empId = empId;
        this.salary = sal;
        this.bonus = bonus;
    }
    int calculateTotalSalary(){
        return salary+bonus;
    }
}
