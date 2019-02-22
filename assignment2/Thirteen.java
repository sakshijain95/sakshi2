package assignment2;

import java.util.Scanner;

public class Thirteen {

    public static void main(String[] args) {
      //  Eligible el = new Eligible();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age for vote");
        int age = sc.nextInt();
        if (age < 18) {
            throw new Eligible("you are not eligible for voting");
        }
        else
            System.out.println("you should give the vote");
    }
}

    class Eligible extends RuntimeException
    {
        public Eligible(String message)
        {
            super(message);
        }
    }








