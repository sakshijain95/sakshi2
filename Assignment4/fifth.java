package Assignment4;

import java.util.Comparator;
import java.util.TreeSet;



public class fifth {


    public static void main(String[] args) {
        Student s1 = new Student(12, 45, "sakshi");
        Student s2 = new Student(4, 50, "Parul");
        Student s3 = new Student(11, 50, "Deeksha");
        Student s4 = new Student(19.8, 70, "Pooja");
        Student s5 = new Student(14.5, 40, "Shivangi");

        TreeSet<Student> hm = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student e1, Student t1) {
                int compResult = (int) (e1.score - t1.score);
                return (compResult == 0 ? e1.name.compareTo(t1.name) : compResult);
            }
        });
        hm.add(s1);
        hm.add(s2);
        hm.add(s3);
        hm.add(s4);
        hm.add(s5);

        System.out.println("sorting salary in ascending order");
        for (Student e : hm) {
            System.out.println(e);
        }
        //  System.out.println("===========================");                    

    }

}
