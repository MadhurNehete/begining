public class B
{
  int a= 10;

public void m1()
{
System.out.println("m1------B");
}
public static void main ( String args[])
{
   System.out.println("main----method");

    B b = new B();
      b.m1();
System.out.println(b.a);

System.out.println("main ------end");

}

}