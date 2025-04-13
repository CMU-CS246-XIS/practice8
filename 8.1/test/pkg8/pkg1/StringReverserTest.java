/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkg8.pkg1;

import org.junit.Test;
import static org.junit.Assert.*;
public class StringReverserTest {
    @Test
    public void testReverseStringWithNormalString() {
        assertEquals("dcba", StringReverser.reverseString("abcd"));
    }

    @Test
    public void testReverseStringWithWhitespace() {
        assertEquals(" cba", StringReverser.reverseString("abc "));
    }

    @Test
    public void testReverseStringWithEmptyString() {
        assertEquals("", StringReverser.reverseString("")); 
    }

    @Test
    public void testReverseStringWithSpecialCharacters() {
        assertEquals("!@#", StringReverser.reverseString("#@!"));
    }

    @Test
    public void testReverseStringWithSingleCharacter() {
        assertEquals("a", StringReverser.reverseString("a"));
    }
}
