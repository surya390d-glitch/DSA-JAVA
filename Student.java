
public class Student {
    private int id;
    private String name;
    private int age;
    private String department;

    public Student(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String toFileString() {
        return id + "," + name + "," + age + "," + department;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Age: " + age +
               ", Department: " + department;
    }

    public static Student fromFileString(String line) {
        String[] data = line.split(",");
        return new Student(
                Integer.parseInt(data[0]),
                data[1],
                Integer.parseInt(data[2]),
                data[3]
        );
    }
}
