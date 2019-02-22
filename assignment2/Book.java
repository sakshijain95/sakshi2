package assignment2;
   interface LibraryManagmnt{

       public void bookName();
    }
    abstract class Library implements LibraryManagmnt{
        abstract void SubjName ();


    }



    public class Book extends Library {

        Book() {
            System.out.println("class Book extending Library implementing Library Managmnt");
        }

        public void bookName() {
            System.out.println("NageshwarRao");
        }

        public void SubjName()
        {

            System.out.println("Java");
        }


        public static void main(String[] args) {
            LibraryManagmnt lib = new Book();
            lib.bookName();
            ((Book) lib).SubjName();



            }
        }

