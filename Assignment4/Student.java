package Assignment4;

public class Student {

    double age;
    double score;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }

    Student(double age, double score, String name) {
        this.age = age;
        this.score = score;
        this.name = name;



    }


}