package com.example;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input marks for 5 subjects
        System.out.println("Enter marks for 5 subjects (out of 100):");
        int[] marks = new int[5];
        float total = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        
        // Calculate Average Percentage
        float average = total / 5;
        
        // Assign Grade based on average
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }
        
        // Display Results
        System.out.println("\n--- Result Summary ---");
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}
