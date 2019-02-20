package one;

import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original string");
        String str1=sc.nextLine();
        System.out.println("Enter the substring");
        String subs1=sc.nextLine();
        System.out.println("Enter the replaced string");
        String toreplaced=sc.nextLine();
        str1=str1.replaceAll(subs1,toreplaced);
        System.out.println(str1);


    }
}
