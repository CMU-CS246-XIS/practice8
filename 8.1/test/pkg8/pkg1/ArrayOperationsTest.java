/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkg8.pkg1;

import org.junit.Test;
import static org.junit.Assert.*;
public class ArrayOperationsTest {
    @Test
    public void testFiMaxNum() {
        assertEquals(5, ArrayOperations.fiMaxNum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(100, ArrayOperations.fiMaxNum(new int[]{100, 50, 20, 10, 1})); 
        assertEquals(-1, ArrayOperations.fiMaxNum(new int[]{-5, -10, -1, -3})); 
        assertEquals(0, ArrayOperations.fiMaxNum(new int[]{0, 0, 0})); 
    }

    @Test
    public void testFiMaxNumForEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayOperations.fiMaxNum(new int[]{});
        });
    }

    @Test
    public void testFiMaxNumForSingleElement() {
        assertEquals(10, ArrayOperations.fiMaxNum(new int[]{10}));
    }

    @Test
    public void testFiMaxNumForNullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayOperations.fiMaxNum(null);
        });
    }
}
