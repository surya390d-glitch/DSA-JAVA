class Inherit{
        public static void main (String [] args){
            student obj = new student("Rock Feller",34,23, 87);
            // Person obj1 = new Person("feller",32); 
            obj.displayStudentDetails();
            obj.Display_PersonDetails();
        }
}

class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age ;
    }

    void Display_PersonDetails() {
        System.out.println("Person Name: " + name);
        System.out.println("Person age: " + age);
    }
}

class student extends Person {
    int rollno;
    int mark;

    student(String name, int age, int rollno, int mark) {
        super(name, age);
        this.rollno = rollno;
        this.mark = mark;
    }

    void displayStudentDetails() {
        System.out.println("Student rollno: " + rollno);
        System.out.println("Student marks: " + mark);
        }

    
}
