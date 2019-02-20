package eleven;

public class Bank {
        public void getDetails(String branchname,int roi)
        {
            System.out.println("Branch Name is " +branchname);
            System.out.println("Rate of interest is " +roi);
           // System.out.println("the bank details");
            //System.out.println("the bank details");


        }
    }
    class SBI extends Bank {
        SBI() {
            System.out.println("SBI BANK");

        }

        public void getDetails(String branchname, int roi) {
            System.out.println("Branch Name is " + branchname);
            System.out.println("Rate of interest is " + roi);

        }

    }
    class ICICI extends Bank {

        ICICI() {

            System.out.println("ICICI BANK");
        }

        public void getDetails(String branchname, int roi) {
            System.out.println("Branch Name is " + branchname);
            System.out.println("Rate of interest is " + roi);
        }
    }

        class AXIS extends Bank {

            AXIS() {

                System.out.println("AXIS BANK");
            }

            public void getDetails(String branchname, int roi) {
                System.out.println("Branch Name is " + branchname);
                System.out.println("Rate of interest is " + roi);

            }

        }
