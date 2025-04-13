/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.pkg1;

/**
 *
 * @author ADMIN
 */
public class MathOperations {
    public static long calFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Số phải là số nguyên dương.");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
