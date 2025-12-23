package guvitask4.Q4;
import java.util.HashMap;

class StudentGrades {

    HashMap<String, Integer> grades = new HashMap<>();

    void addStudent(String name, int grade) {
        grades.put(name, grade);
        System.out.println("Student added: " + name);
    }

    void removeStudent(String name) {
        if (grades.containsKey(name)) {
            grades.remove(name);
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    void displayGrade(String name) {
        if (grades.containsKey(name)) {
            System.out.println(name + "'s Grade: " + grades.get(name));
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public static void main(String[] args) {

        StudentGrades sg = new StudentGrades();

        sg.addStudent("Ramesh", 85);
        sg.addStudent("Suresh", 90);

        sg.displayGrade("Ramesh");
        sg.removeStudent("Suresh");
        sg.displayGrade("Suresh");
    }
}

