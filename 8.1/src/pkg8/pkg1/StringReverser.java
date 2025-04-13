/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.pkg1;

/**
 *
 * @author ADMIN
 */
public class StringReverser {
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] reversedArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            reversedArray[i] = str.charAt(str.length() - 1 - i);
        }
        return new String(reversedArray);
    }
}
