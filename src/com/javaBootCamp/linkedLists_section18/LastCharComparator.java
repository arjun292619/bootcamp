package com.javaBootCamp.linkedLists_section18;

import java.util.Comparator;

public class LastCharComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return Character.compare(s1.charAt(s1.length() - 1), s2.charAt(s2.length() - 1));
    }
}
