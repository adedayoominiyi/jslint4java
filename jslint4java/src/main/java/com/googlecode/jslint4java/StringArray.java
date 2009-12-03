package com.googlecode.jslint4java;

/**
 * A convenient shim to allow creating an array from a comma separated list in a
 * string.
 *
 * @author hdm
 *
 */
public class StringArray {
    /**
     * Parse a comma separated string into an array..
     */
    public static String[] valueOf(String str) {
        return str.split("\\s*,\\s*");
    }
}