import java.util.*;
public class ObjectCompare {
    public static void main(String args[]){
        Student s1 = new Student("Senti",003,8.0);
        Student s2 = new Student("Badal",001,9.5);
        Student s3 = new Student("Basil",005,6.5);
        Student s4 = new Student("Harsh",006,7.5);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println(list);
        Collections.sort(list); // By Comparable Interface...
        System.out.println(list);

        Arrange arrange = new Arrange();
        Collections.sort(list,arrange); // By Compartor Interface...
        System.out.println(list);
    }
}
class Arrange implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.cgpa > o2.cgpa) return 1;
        else if(o1.cgpa < o2.cgpa) return -1; 
        else return 0;
    }
    
}
class Student implements Comparable<Student> {
    String name;
    int rollNo;
    double cgpa;
    public Student(String name, int rollNo, double cgpa){
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }
    @Override
    public String toString(){
        return "Name: "+this.name+" && RollNo: "+rollNo+" && CGPA: "+cgpa + "\n";
    }
    @Override
    public int compareTo(Student o){
        if(this.rollNo > o.rollNo) return 1;
        else if(this.rollNo < o.rollNo) return -1;
        else return 0;
    }
}
