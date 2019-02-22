package assignment2;

import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {

        {
            String str = " ";

            Scanner sc = new Scanner(System.in);
            boolean flag = true;
while(flag) {
    System.out.println("enter the string");

    str = sc.nextLine();

    if (str.equals("done")) {
        flag = false;
    }
    else
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
        System.out.println("first and last characters are equal");

            }
            else
            System.out.println("first and last are not equal");
}

        }

    }
}

