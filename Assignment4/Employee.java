package Assignment4;

import java.util.Comparator;



   public class Employee {


        double age;
        double salary;
        String name;

        Employee(double age, double salary, String name) {
            this.age = age;
            this.salary = salary;
            this.name = name;


        }

        @Override
        public String toString() {
            return "Employee{" +
                    "age=" + age +
                    ", salary=" + salary +
                    ", name='" + name + '\'' +
                    '}';
        }

     //  @Override
      /* public int compare(Employee t0, Employee t1) {
           return (int) (t0.salary-t1.salary);
       };*/


    }


