package ru.synergy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Object o = new Scanner(System.in);
//
//        Scanner scanner = null;
//
//        if ( o instanceof Scanner ) scanner = (Scanner) o;
//        if ( scanner != null ){
//            scanner.nextInt();
//        }
//        ((Scanner) o ).nextInt();
//
//        Object o1 = new String();

        // Неправильный код
//        Object[] objects = {10,"Hai",3,14};  // автоупаковка
//
//        for (Object o : objects){
//            if ( o  instanceof String ){
//                String s = (String) o;
//                System.out.println(s);
//            }
//        }
//
//        ArrayList numbers = new ArrayList();  // сохраняет Object
//
//        for(int i = 0; i < 10; i++)
//        {  //  сохранять в коллекцию числа 10,20,....100
//             numbers.add( i*10 );
////             numbers.add( i*10.4f );
//        }
//        int sum = 0;
//        for (Object o: numbers){
//            sum = sum + (Integer) o;
//
//        }
        int sum = 0;
        System.out.println(sum);


        Object[] objects = {10,"Hai",3,14};  // автоупаковка

        for (Object o : objects){
            if ( o  instanceof String ){
                String s = (String) o;
                System.out.println(s);
            }
        }

        ArrayList<Integer> numbers = new ArrayList();  // сохраняет Object

        for(int i = 0; i < 10; i++)       //  сохранять в коллекцию числа 10,20,....100
        {
             numbers.add( i*10 );
//             numbers.add( i*10.4f );
        }

        for (Integer o: numbers){
            sum = sum + /*(Integer)*/ o;

        }
        System.out.println(sum);

        // Основной тип <тип параметр>


    }
}

