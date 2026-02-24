/*4.Employee Salary with BonusQuestion:
Create a class Employee with empId, name, salary. Create a method to calculate bonus:

If salary > 50,000, bonus = 10%

Else bonus = 5%

Print final salary (salary + bonus).
 */
public class Emp {
    public static void main(String [] args){
        Employee obj = new Employee("rock feller",99,45000);
        obj.calculate_bonus();
    }
    
}

class Employee {
    int empId, salary;
    String name;

    Employee(String name, int empId, int salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    void calculate_bonus() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Salary: " + salary);
        if (salary >= 50000) {
            double Bonus = (salary * 0.10);
            System.out.println("Bonus 10% added: " + (Bonus + salary));
        } else {
            double Bonus = (salary * 0.05);
            System.out.println("Bonus 5% added: " + (Bonus + salary));
        }
    }
}

