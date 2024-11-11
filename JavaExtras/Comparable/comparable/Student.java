package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Student implements Comparable<Student>{
    int id;
    String name;
    int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }

    @Override
    public int compareTo(Student o) {
        if(this.id>o.id) return 1;
        else if(this.id<o.id) return -1;
        else return 0;
    }

     public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"John", 90));
        students.add(new Student(3,"Alice", 85));
        students.add(new Student(4,"Bob", 95));
        students.add(new Student(2,"Charlie", 80));
        Collections.sort(students);

        students.forEach(s->System.out.println(s.id+" "+s.name+" "+s.age));
    }
}