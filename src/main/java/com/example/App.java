package com.example;

public class App {

    public int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    public double calculateAverage(int m1, int m2, int m3) {
        return (m1 + m2 + m3) / 3.0;
    }

    public String calculateGrade(double avg) {

        if (avg >= 90)
            return "A";
        else if (avg >= 75)
            return "B";
        else if (avg >= 60)
            return "C";
        else if (avg >= 50)
            return "D";
        else
            return "F";
    }

    public static void main(String[] args) {

        App gradeCalc = new App();

        int m1 = 85;
        int m2 = 90;
        int m3 = 80;

        int total = gradeCalc.calculateTotal(m1, m2, m3);
        double avg = gradeCalc.calculateAverage(m1, m2, m3);
        String grade = gradeCalc.calculateGrade(avg);

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade);
    }
}
