package guvitask4;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    int rollNo;
    String name;
    String course;
    int age;

    Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {


        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not between 15 and 21");
        }

        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name contains numbers or special characters");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Ramesh", 20, "Computer Science");
            s1.display();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

