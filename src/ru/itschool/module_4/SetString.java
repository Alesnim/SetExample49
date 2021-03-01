package ru.itschool.module_4;

import java.util.Arrays;

public class SetString {
    private boolean[] strings;


    public SetString() {
        this.strings = new boolean[56];
    }

    private int getHash(String s) {
        int hash = 0;
        int R = 31;
        for (int i = 0; i < s.length(); i++) {
            hash = (R * hash + s.charAt(i)) % strings.length;
        }
        return hash;
    }

    public void addString(String i) {
        int h = getHash(i);
        if (h < strings.length) strings[h] = true;
    }

    public boolean contains(String s) {
        int h = getHash(s);
        if (h < strings.length) return strings[h];
        else return false;
    }

    @Override
    public String toString() {
        return "SetString{" +
                "strings=" + Arrays.toString(strings) +
                '}';
    }
}
