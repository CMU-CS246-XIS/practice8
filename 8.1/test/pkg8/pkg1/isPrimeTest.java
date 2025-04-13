/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkg8.pkg1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class isPrimeTest {

    @Test
    public void testPrimeNumbers() {
        assertEquals(true, isPrime.isPrime(2));  
        assertEquals(true, isPrime.isPrime(3));  
        assertEquals(true, isPrime.isPrime(5));  
        assertEquals(true, isPrime.isPrime(13)); 
    }

    @Test
    public void testNonPrimeNumbers() {
        assertEquals(false, isPrime.isPrime(1));
        assertEquals(false, isPrime.isPrime(4)); 
        assertEquals(false, isPrime.isPrime(9)); 
        assertEquals(false, isPrime.isPrime(100));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(false, isPrime.isPrime(-1)); 
        assertEquals(false, isPrime.isPrime(-5)); 
    }

    @Test
    public void testZero() {
        assertEquals(false, isPrime.isPrime(0));  
    }

    @Test
    public void testLargePrimeNumber() {
        assertEquals(true, isPrime.isPrime(104729));  
    }

    @Test
    public void testLargeNonPrimeNumber() {
        assertEquals(false, isPrime.isPrime(104730));
    }
}
