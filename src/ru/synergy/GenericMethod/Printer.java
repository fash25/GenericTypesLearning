package ru.synergy.GenericMethod;

public class Printer {
    public <T> void  print(T[] items){
        for (T item : items){
            System.out.println(item);

        }
    }

}
