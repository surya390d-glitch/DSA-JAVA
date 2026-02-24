import java.io.*;
import java.util.*;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();
    private final String FILE_NAME = "students.txt";

    public StudentService() {
        loadFromFile();
    }

    public void addStudent(Student student) {
        students.add(student);
        saveToFile();
        System.out.println("Student added successfully.");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getId() == id) {
                iterator.remove();
                saveToFile();
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                bw.write(s.toFileString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    private void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                students.add(Student.fromFileString(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading file.");
        }
    }
}

