package assignment2;

public class Seventh {
        public static void convert(int num)
        {
            int days = num/(24*3600);
            num%= (24*3600);
            int hour = num/3600;
            num %= 3600;
            int minutes = num/60 ;
            num %= 60;
            int seconds = num;
            System.out.println( days + " " + "no. of days..... " + hour
                    + " " + "no of hours..... " + minutes + " "
                    + "no of minutes..... " + seconds + " "
                    + "no of seconds..... ");

        }
        public static void main (String[] args)
        {
// Given n is in seconds
            int num = 5467889;
            convert(num);
        }
    }
