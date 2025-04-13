/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkg8.pkg1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathOperationsTest {
    @Test
    public void testCalFactorial() {
        assertEquals(1, MathOperations.calFactorial(0));
        assertEquals(120, MathOperations.calFactorial(5));
        assertEquals(720, MathOperations.calFactorial(6)); 
        assertEquals(4037913, MathOperations.calFactorial(11));
    }

    @Test
    public void testFactorialForNegativeNumber() {
        IllegalArgumentException assertThrows = assertThrows(IllegalArgumentException.class, () -> {
            MathOperations.calFactorial(-1);
        });
    }
}
