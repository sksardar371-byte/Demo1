import java.util.*;
class Student implements Comparable<Student>{
    String name;
        int age;
    int rollno;
    public Student(String name,int age,int rollno)
{
    this.name=name;
    this.age=age;
    this.rollno=rollno;
}

public int compareTo(Student s){
    if(s.age>this.age){
        return 1;
    }
    else{
        return -1;
    }

}
 public  String toString(){
    return "Name:"+name+" Age:"+age+" Rollno:"+rollno;
 }
}
public  class Comparable1{
    public static void main(String args[]){
       List<Student>list=new ArrayList<>();
       list.add(new Student("amit",21,1));
       list.add(new Student("rahul",25,2));
       list.add(new Student("priya",20,3));     
       list.add(new Student("neha",23,4));

       Collections.sort(list);
        
        for(Student s:list){
            System.out.println(s);
        }

    }
}