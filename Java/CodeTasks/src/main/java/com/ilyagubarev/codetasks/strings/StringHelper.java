package com.ilyagubarev.codetasks.strings;

/**
 * String processing methods.
 *
 * @version 1.01, 31 August 2013
 * @since 31 August 2013
 * @author Ilya Gubarev
 */
public final class StringHelper {

    /**
     * Checks if specified ANSI strings are permutations of each other.
     *
     * @param string1 one string.
     * @param string2 another string.
     * @return true if the strings are permutations of each other.
     */
    public static boolean checkIfPermutations(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        int[] register = new int[255];
        for (int i = 0; i < string1.length(); ++i) {
            ++register[string1.charAt(i)];
        }
        for (int i = 0; i < string2.length(); ++i) {
            char c = string2.charAt(i);
            if (register[c] == 0) {
                return false;
            }
            --register[c];
        }
        return true;
    }

    /**
     * Checks if there are duplicated symbols in specified ANSI string.
     *
     * @param string an ANSI string.
     * @return true if contains duplicated characters.
     */
    public static boolean containsDups(String string) {
        if (string.length() < 2) {
            return false;
        }
        boolean[] register = new boolean[255];
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (register[c]) {
                return true;
            }
            register[c] = true;
        }
        return false;
    }

    /**
     * Checks if there are duplicated symbols in specified string.
     *
     * @param string a string.
     * @return true if contains duplicated characters.
     */
    public static boolean containsDupsNoRegister(String string) {
        if (string.length() < 2) {
            return false;
        }
        for (int front = 1; front < string.length(); ++front) {
            char c = string.charAt(front);
            for (int back = 0; back < front; ++back) {
                if (string.charAt(back) == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Reverses specified string in place.
     *
     * @param string a null-terminated string as an array of characters.
     */
    public static void reverseInPlace(char[] string) {
        int tail = 0;
        while (string[tail] != 0) {
            ++tail;
        }
        --tail;
        int head = 0;
        while (head < tail) {
            char buffer = string[head];
            string[head++] = string[tail];
            string[tail--] = buffer;
        }
    }

    private StringHelper() {

    }
}
