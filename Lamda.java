interface Demo{
    int add(int a,int b);
}
public class Lamda{
    public static void main(String args[]){
        Demo d=(a,b)->a+b;
       System.out.println(d.add(5,10));
    }
}