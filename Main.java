// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class A{
     void add(int a,int b){
        System.out.println(a+b);
    }
}
 public class Main  extends A{
    public void add(int a,int b){
        System.out.println(a+b+1);
    }

    public static void main(String[] args) {
      Main m=new Main();
      m.add(3,4);
    }
}