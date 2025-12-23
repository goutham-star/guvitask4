package guvitask4.Q2;

class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

class Voter {
    int voterId;
    String name;
    int age;

    Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Voter ID : " + voterId);
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
    }
}

public class CheckedException {
    public static void main(String[] args) {
        try {
            Voter v1 = new Voter(1001, "Ramesh", 20);
            v1.display();
        } catch (InvalidVoterAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

