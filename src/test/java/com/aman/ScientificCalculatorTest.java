package com.aman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.aman.ScientificCalculator;

public class ScientificCalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, Math.sqrt(16), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, ScientificCalculator.factorial(5));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(0, Math.log(1), 0.001);
    }

    @Test
    public void testPowerFunction() {
        assertEquals(8.0, Math.pow(2, 3), 0.001);
    }
}
