import java.util.*;
public class Student{
    public static void main(String args[]){
        Comparator<String>com= (String s1,String s2)-> s1.compareTo(s2);

        
        List<String> list=new ArrayList<>();
        list.add("Ravi");
        list.add("vijay");
        list.add("rajiu");
        list.add("ajay");
        Collections.sort(list,com);
        System.out.println(list);
        
    }
}