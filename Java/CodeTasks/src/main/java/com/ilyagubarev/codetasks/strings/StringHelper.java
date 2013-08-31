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

    private StringHelper() {

    }
}
