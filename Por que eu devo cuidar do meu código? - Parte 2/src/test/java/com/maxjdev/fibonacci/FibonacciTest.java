package com.maxjdev.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void findElementDPTest() {
        assertEquals(5, Fibonacci.findElementDP(5));
    }

    @Test
    public void findElementDPTest_zero() {
        assertEquals(0, Fibonacci.findElementDP(0));
    }

    @Test
    public void findElementDPTest_one() {
        assertEquals(13, Fibonacci.findElementDP(7));
    }
}
