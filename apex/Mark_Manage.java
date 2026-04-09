/*2. Student Grade Calculation
Question:
Create a class Student with attributes name, marks1, marks2, marks3. Write methods to:
calculate total
calculate average
display grade based on average
*/
class Mark_Manage {
    public static void main(String[] args) {
        Stud obj = new Stud("ayonokoji",23,45,67);
        obj.display_Grade();
    }
}

class Stud {
    String name;
    int marks1, marks2, marks3;

    Stud(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    int calculate_Total() {
        return marks1 + marks2 + marks3;
    }

    double calc_Avg() {
        return calculate_Total() / 3.0;
    }

    void display_Grade() {
        double avg = calc_Avg();
        System.out.print("name: " + name);
        System.out.print("\ntotal marks : " + calculate_Total());
        System.out.print("\naverage mars:  " + avg);

        if (avg >= 90) {
            System.out.print("grade A");
        } else if (avg >= 75) {
            System.out.print("\ngrade B");
        } else if (avg >= 50) {
            System.out.print("\ngrade c");
        }

        else {
            System.out.println("\nFail");
        }

    }

}
