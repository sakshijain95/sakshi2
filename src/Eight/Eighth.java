package Eight;

public class Eighth {

    public static void rev()
    {

        StringBuffer sb = new StringBuffer("sakshijain");
        System.out.println("Passeed string  " +sb);
        sb.reverse();
        System.out.println("reversed string " +sb);

        sb.delete(4,10);
        System.out.println("After deletion " +sb);

    }


}

