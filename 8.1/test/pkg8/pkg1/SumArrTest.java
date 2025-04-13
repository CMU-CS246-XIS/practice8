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
public class SumArrTest {
     @Test
    public void testCalSumWithPositiveNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals("Tong cua {1,2,3,4,5} phai la 15", 14, SumArr.calSum(arr));
    }

    @Test
    public void testCalSumWithNegativeNumbers() {
        int[] arr = {-1, -2, -3};
        assertEquals("Tong cua {-1,-2,-3} phai la -6", -6, SumArr.calSum(arr));
    }

    @Test
    public void testCalSumWithMixedNumbers() {
        int[] arr = {1, -1, 2, -2};
        assertEquals("Tong cua {1,-1,2,-2} phai la 0", 0, SumArr.calSum(arr));
    }
}
