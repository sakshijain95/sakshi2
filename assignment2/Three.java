package assignment2;



public class Three {


        public static void main(String args[]) {
            try
            {
                Class.forName("assignmnt");
            }
            catch (ClassNotFoundException ex)
            {
                ex.printStackTrace();
                System.out.println("123");
            }
        }
    }

    //noclass def found error
