package ru.itschool.module_4;

import java.util.Arrays;

public class SetHash {
    private boolean[] numbers;

    public SetHash() {
        this.numbers = new boolean[59];
    }

    public int getHash(int l){
        return l % numbers.length;
    }


    public void addNumber(int l) {
        numbers[getHash(l)] = true;
    }

    public boolean contains(int l) {
        return numbers[getHash(l)];
    }


    @Override
    public String toString() {
        return "SetHash{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
