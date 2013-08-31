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
     * Checks if there are duplicated symbols in specified ANSI string.
     *
     * @param string an ANSI string.
     */
    public static boolean containsDups(String string) {
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
     */
    public static boolean containsDupsNoRegister(String string) {
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
