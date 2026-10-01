import java.util.*;
class Student implements Comparator<Student>{
    String name;
    int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public int compare(Student s1,Student s2){
        if(s1.age>s2.age){
            return 1;
        }
        else{
            return -1;
        }
    }
    public String toString(){
        return "Name:"+" "+name+" "+"age:"+" "+age;
    }
}
public class Comparator1
{
    public static void main(String args[]){
        List<Student> list=new ArrayList<Student>();

        list.add(new Student("amit",21));
        list.add(new Student("rahul",25));          
        list.add(new Student("priya",20));
        list.add(new Student("neha",23));
        Collections.sort(list,new Student("",0));
        for(Student s:list){
            System.out.println(s);
        }
       
    }
}