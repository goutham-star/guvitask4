package guvitask4.Q2;

class InvalidVoterAgeException extends RuntimeException {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

class Voter {
    int voterId;
    String name;
    int age;

    Voter(int voterId, String name, int age) {
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

public class UncheckedException {
    public static void main(String[] args) {
        Voter v1 = new Voter(1002, "Suresh", 16); 
        v1.display();
    }
}

