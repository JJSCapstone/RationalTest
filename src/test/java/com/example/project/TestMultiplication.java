package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestMultiplication
{
   
    @Test
     public void testMultiplication()
   {
     Multiplication multiplication = new Multiplication();
     
     int a, b, c;
     
     // action
     a = multiplication.getA();
     b = multiplication.getB();
     c = multiplication.getC();

     // assertion
     if (a == 0 && b == 0 && c == 0)
     {
        assertEquals(0, 1); // force fail if all values are 0.
     } else {
        assertEquals(a * b, c);
     }

   }
}
