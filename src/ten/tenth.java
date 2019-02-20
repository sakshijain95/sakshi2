package ten;
import java.sql.SQLOutput;
import java.util.*;


public class tenth {

    public static void add(int x,int y)

    {
        System.out.println("----add two integers----");
        int sum= x+y;
        System.out.println(sum);
    }

    public static void add(double x,double y)
    {    System.out.println("----add two doubles----");
        double sum=x+y;
        System.out.println(sum);
    }

    public static void multi(float x,float y)
    {
        //Scanner sc=new Scanner(System.in);
        //x=sc.nextFloat();
        //y=sc.nextFloat();
        System.out.println("----multiply two float numbers----");
        float mul = x*y;
        System.out.println(mul);

    }
    public static void multi(int x,int y)
    {
        System.out.println("----multiply two integers----");
        int mul = x*y;
        System.out.println(mul);

    }

    public static void concate(String str,String str1)
    {
        System.out.println("----concatenate two strings----");
        String str2=str.concat(str1);
        System.out.println(str2);

    }

    public static void concate(String str,String str1,String str2)
    {
        System.out.println("----concatenate three strings----");
        String str3=str+str1+str2;
        System.out.println(str3);

    }



}
