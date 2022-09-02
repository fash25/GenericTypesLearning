package ru.synergy;

import java.util.ArrayList;
import java.util.HashMap;
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

        // ОсновнойТип <ТипПараметр>
        // ОсновнойТип <ТипПараметр1, ТипПараметр2,ТипПараметр3,ТипПараметр4.... >

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(7,"Hai");
        map.put( 15,"Buy-buy" );

        ArrayList<String> listBuyBuy = new ArrayList<>();
        listBuyBuy.add( "Buy-buy" );
        listBuyBuy.add( "Hi" );

        ArrayList<String> listHi = new ArrayList<>();
        listHi.add( "Hi-Hi" );
        listHi.add( "Babun" );

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add( listBuyBuy );
        list.add( listHi );

        for (ArrayList<String> spisok : list){
            for (String s : spisok){
                System.out.println(s);
            }
        }
    }
}
/*
*     то что делаем мы в коде                           то во что преобразует компилятор
* ArrayList<Integer> list = new ArrayList<Integer>();  ArrayList list = new ArrayList()
* list.add(1);
* int x = list.get(0);                                 int x = (Integer) list.get(0);
* list.set(0,10);                                      list.set(0,(Integer) 10);

*/
