/*1.Student Result System (Single Inheritance)
Create a parent class Person with:
name
age
method displayPersonDetails()
Create a child class Student that inherits Person and adds:
rollNo
marks
method displayStudentDetails()
Display full student information.*/
public class StudentResultSystem {
    static void main(String[] args) {
        Student s1 = new Student("surya_Ayono",19,34,75);
        s1.displayPersonDetails();
        s1.AcademicDetails();
    }
}
class Person{
    String name;
    int age;
    void displayPersonDetails(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Name: "+name+" |Age: "+age);
        System.out.println("--------------------------------------------------------------------------------");
    }
}
class Student extends Person
{
    Student(String name,int age, int rollNo, int marks){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    int rollNo, marks;
    void AcademicDetails(){
        System.out.println("Roll.no: "+rollNo+" |Marks: "+marks);
    }
}
