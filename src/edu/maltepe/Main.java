package edu.maltepe;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100);
        int estimation=0;

        while (estimation != number) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a number between 0 to 100: ");
            estimation = input.nextInt();

            if (estimation < number) {
                System.out.println("You entered less than the actual value.");
            } else if(estimation>number){
                System.out.println("You entered more than the actual value.");
            }
            else {
                System.out.println("Congraculations! You won!");
            }
        }

    }
}