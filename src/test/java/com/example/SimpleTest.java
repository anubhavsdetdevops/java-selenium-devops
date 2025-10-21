package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SimpleTest {
    @Test
    public void testBasicMath() {
        assertEquals(2 + 2, 4, "Basic addition should work");
        System.out.println("✅ Java test passed in container!");
    }
    
    @Test 
    public void testString() {
        assertEquals("hello".toUpperCase(), "HELLO", "String conversion should work");
    }
}
