package Assignment4;

import java.util.*;

public class EmployeeForth {

    public static void main(String[] args) {
        Employee e1 = new Employee(12, 30000, "sakshi");
        Employee e2 = new Employee(4, 50000, "Parul");
        Employee e3 = new Employee(11, 80000, "Deeksha");
        Employee e4 = new Employee(19.8, 70000, "Pooja");
        Employee e5 = new Employee(14.5, 40000, "Shivangi");

        TreeSet<Employee> hm = new TreeSet<Employee>(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee t1) {
                return (int) (e1.salary - t1.salary);
            }
        });
        hm.add(e1);
        hm.add(e2);
        hm.add(e3);
        hm.add(e4);
        hm.add(e5);

        System.out.println("sorting salary in ascending order");
        for (Employee e : hm) {
            System.out.println(e);
        }
        //  System.out.println("===========================");

    }
}