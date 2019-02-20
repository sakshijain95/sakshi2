package four;

public class forth {


    public static void per(String inputString)
    {
        //Getting total no of characters in the given string

        int total = inputString.length();

        //Initializing upr, lwr, digits and special with 0

        int upr = 0;

        int lwr = 0;

        int digits = 0;

        int special = 0;

        //Iterating through each character of inputString

        for (int i = 0; i < inputString.length(); i++)
        {
            char ch = inputString.charAt(i);

            if(Character.isUpperCase(ch))
            {
                upr++;
            }

            else if(Character.isLowerCase(ch))
            {
                lwr++;
            }

            else if (Character.isDigit(ch))
            {
                digits++;
            }

            else
            {
                special++;
            }
        }

        double upperCaseLetterPercentage = (upr * 100.0) / total ;

        double lowerCaseLetterPercentage = (lwr * 100.0) / total;

        double digitsPercentage = (digits * 100.0) / total;

        double otherCharPercentage = (special * 100.0) / total;



        System.out.println("In '"+inputString+"' : ");

        System.out.println("Uppercase letters are"+upperCaseLetterPercentage+"% ");

        System.out.println("Lowercase letters are "+lowerCaseLetterPercentage+"%");

        System.out.println("Digits Are "+digitsPercentage+"%");

        System.out.println("Special Characters Are "+otherCharPercentage+"%");
        System.out.println("-----------------------------");
    }

    public static void main(String[] args)
    {
        per("Hardwork always pays you back @ 100 %");


    }
}
