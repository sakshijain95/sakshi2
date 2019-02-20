package st;

public class Seven {

    static int age = 21;
    static String Firstname = "Sakshi";
    static String Lastname = "Jain";


    static {

        System.out.println("-------Static block------");
        String Firstname = "sakshi";
        String Lastname = "Jain";
        int age = 21;
        System.out.println(Firstname);
        System.out.println(Lastname);
        System.out.println(age);
    }

    public static void print() {
        System.out.println("-----using static method and variable-----");
        System.out.println(age);
        System.out.println(Firstname);
        System.out.println(Lastname);

    }

}
