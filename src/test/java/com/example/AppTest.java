package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    App grade = new App();

    @Test
    public void testTotal() {
        assertEquals(255, grade.calculateTotal(85, 90, 80));
    }

    @Test
    public void testAverage() {
        assertEquals(85.0, grade.calculateAverage(85, 90, 80), 0.01);
    }

    @Test
    public void testGradeA() {
        assertEquals("A", grade.calculateGrade(92));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", grade.calculateGrade(80));
    }

    @Test
    public void testGradeFail() {
        assertEquals("F", grade.calculateGrade(40));
    }
}
