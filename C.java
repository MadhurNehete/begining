public class C
{ 
int b= 9;

public void m2()
{
 System.out.println("m2-----C");
}
public static void main(String args[])
{ 
 System.out.println("main-----C");
    
        C c =new C();
        c.m2();
 System.out.println(c.b);

 System.out.println("main------end");
 
}

}