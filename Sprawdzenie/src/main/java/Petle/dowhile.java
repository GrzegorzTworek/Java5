package Petle;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*System.out.println("Enter a number ");

        int value = in.nextInt();

        while(value != 5){
            System.out.println ("Enter a number: ");
            value = in.nextInt();
        }
        System.out.println("Got 5");*/
        int value =0;
        do {    System.out.println ("Enter a number: ");
           value = in.nextInt();
        }
           while(value !=5);
        {
            System.out.println("Got 5");
        }
    }
}
