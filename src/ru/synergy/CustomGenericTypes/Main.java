package ru.synergy.CustomGenericTypes;

public class Main {

    public static void main(String[] args){


        Account acc1 = new Account( id 12345, sum 5000);

        System.out.println(acc1.getId());

        Account acc2 = new Account( id "sid12345", sum 5000);

        System.out.println(acc2.getId());

        int a = ((Integer) acc1.getId()) + 10;



    }
}
