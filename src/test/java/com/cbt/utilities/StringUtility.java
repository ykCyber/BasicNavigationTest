package com.cbt.utilities;

public class StringUtility {
    public static void verifyEquals(String expected, String actual) {
        if (actual.equals(expected) == true) {
            System.out.println("PASS");
        } else if (actual.equals(expected) == false) {
            System.out.println("FAIL");
        }
        else{
            System.err.println("Error on verifyEquals method");

        }
    }
}
