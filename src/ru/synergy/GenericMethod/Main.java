package ru.synergy.GenericMethod;

public class Main {
    public static void main(String[] args){
        Printer printer = new Printer();
        String[] strings = {"Tom","Allice","Sam","Kate","Bob","Helen"};
        Integer[] integers = {25,17,46,115,36,48};
        printer.<String>print( strings );
        printer.<Integer>print( integers );
    }
}
