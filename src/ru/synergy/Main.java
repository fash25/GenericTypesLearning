package ru.synergy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Object o = new Scanner(System.in);

        Scanner scanner = null;

        if ( o instanceof Scanner ) scanner = (Scanner) o;
        if ( scanner != null ){
            scanner.nextInt();
        }
        ((Scanner) o ).nextInt();

        Object o1 = new String();


    }
}

