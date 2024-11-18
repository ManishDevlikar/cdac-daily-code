package school;
import java.util.List;
import java.util.ArrayList;
public class Student {
    private int id;
    private String name;
    private int age;
    private double percentage;

    public Student(int id,String name,int age,double percentage){
        this.id=id;
        this.name=name;
        this.age=age;
        this.percentage=percentage;
    }

    public void getDetails(){
        System.out.println("id: "+this.id);
        System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
        System.out.println("percentage: "+this.percentage);
    }
    
    public static void main(String[] args) {
       List<Student> list = new  ArrayList<>();
       list.add(new Student(1, "ana", 35, 89));
       list.add(new Student(2, "sydney", 30, 80));
       list.add(new Student(3, "scarlett", 33, 78));
       list.add(new Student(4, "suzy", 27, 88));

       list.stream().forEach(s->s.getDetails());
    }
}
