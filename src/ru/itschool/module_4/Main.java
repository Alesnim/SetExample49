package ru.itschool.module_4;

public class Main {

    public static void main(String[] args) {
        SetString setString = new SetString();

        setString.addString("abc");
        setString.addString("bbb");
        System.out.println(setString);
        System.out.println(setString.contains("abc"));
    }


}
