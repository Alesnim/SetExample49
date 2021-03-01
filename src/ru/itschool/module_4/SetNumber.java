package ru.itschool.module_4;

import java.util.Arrays;

public class SetNumber {
    private final boolean[] number = new boolean[51];

    public void addNum(int l) {
        if (l >= 0 && l <= number.length) {
            number[l] = true;
        }
    }

    public boolean contain(int l) {
        return (l >= 0 && l <= number.length)? number[l]: false;
    }

    @Override
    public String toString() {
        return "SetAlpha{" +
                "letter=" + Arrays.toString(number) +
                '}';
    }
}
