package guvitask4.Q3;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {

        String[] days = {
            "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"
        };

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter day index (0-6): ");
            int index = sc.nextInt();

            System.out.println("Day is: " + days[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid day index! Please enter a value between 0 and 6.");
        }

        sc.close();
    }
}

