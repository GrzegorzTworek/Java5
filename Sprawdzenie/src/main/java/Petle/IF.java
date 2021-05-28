package Petle;

import java.util.Scanner;

public class IF {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
int looper = input.nextInt();
int loop = 5;
        int myint = 100;

                if (myint>20)
        System.out.println("It's good ");
                else if(myint<10){
                    System.out.println ("false");
                }
                while (true){
                    System.out.println("Looping: " + loop);

                    if(loop == 5){
                        break;
                    }
                    loop++;
                            System.out.println("Running");
                }
    }
}
