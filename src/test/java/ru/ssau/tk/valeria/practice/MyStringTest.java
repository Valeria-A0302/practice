package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyStringTest {
    @Test
    public static void testStringCharacter() {
        String string = "This is string";
        MyString.stringCharacter(string);
    }

    @Test
    public static void testStringOfBytes() {
        String string = "Hello, world!";
        MyString.stringOfBytes(string);
        System.out.println();
        String newString = "Привет, мир!";
        MyString.stringOfBytes(newString);
    }

    @Test
    public static void testComparison() {
        MyString.comparison();
    }

    @Test
    public static void testPalindrome() {
        String string = "123321";
        Assert.assertTrue(MyString.palindrome(string));

        String newString = "123456";
        Assert.assertFalse(MyString.palindrome(newString));
    }

    @Test
    public static void testStringComparison() {
        String stringOne = "hello";
        String stringTwo = "WORLD";
        Assert.assertTrue(MyString.stringComparison(stringOne, stringTwo));
        Assert.assertFalse(MyString.stringComparison(null, stringTwo));
        Assert.assertFalse(MyString.stringComparison(null, null));
        Assert.assertFalse(MyString.stringComparison(stringOne, "HELLO"));
        Assert.assertFalse(MyString.stringComparison(stringOne, "hello"));
    }

    @Test
    public static void testScreening() {
        MyString.screening();
    }

    @Test
    public static void testIndexOfString() {
        Assert.assertEquals(MyString.indexOfString("понимать", "мать"), 4);
        Assert.assertEquals(MyString.indexOfString("абракадабра", "бра"), 1);
        Assert.assertEquals(MyString.indexOfString("абракадабра", "бам"), -1);
    }

    @Test
    public static void testIndexOfStringTwo() {
        Assert.assertEquals(MyString.indexOfStringTwo("asfasfa", "asf"), 3);
        Assert.assertEquals(MyString.indexOfStringTwo("12345343534", "34"), 5);
        Assert.assertEquals(MyString.indexOfStringTwo("345121212", "45"), -1);
    }

    @Test
    public static void testLastIndexOfString() {
        Assert.assertEquals(MyString.lastIndexOfString("солнышко", "ко"), 6);
        Assert.assertEquals(MyString.lastIndexOfString("12345343534", "35"), 7);
        Assert.assertEquals(MyString.lastIndexOfString("345121212", "99"), -1);
    }

    @Test
    public static void testPostfixAndPrefix() {
        String[] string = new String[]{"1234", "12678", "2348"};
        Assert.assertEquals(MyString.postfixAndPrefix(string, "12", "8"), 1);
        string = new String[]{"abcdf", "adref", "antjkf", "dsgbf"};
        Assert.assertEquals(MyString.postfixAndPrefix(string, "a", "f"), 3);
    }

    @Test
    public static void testNumberOfRows() {
        String[] string = new String[]{"     1237653425    ", "   98534575  ", "  1366475  "};
        Assert.assertEquals(MyString.numberOfRows(string, "1", "5"), 2);
    }
}