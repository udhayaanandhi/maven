package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    GradeService service = new GradeService();

    @Test
    public void testAverageCalculation() {
        int[] marks = {80, 90, 70, 85, 75}; // Total: 400
        assertEquals(80.0, service.calculateAverage(marks), 0.01);
    }

    @Test
    public void testGradeAPlus() {
        assertEquals("A+", service.getGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", service.getGrade(72));
    }

    @Test
    public void testGradeFail() {
        assertEquals("F", service.getGrade(40));
    }

    @Test
    public void testBoundaryCondition() {
        // Testing exactly 80 to ensure 'A' grade boundary is inclusive
        assertEquals("A", service.getGrade(80));
    }
}
