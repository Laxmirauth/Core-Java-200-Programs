import java.util.*;
import apackage.*;
import apackage.bpackage.*;
class progm
{
	public static void main(String s[])
	{
int m,n,o;
Scanner sc=new Scanner(System.in);
System.out.println("enter first value:");
m=sc.nextInt();
System.out.println("enter second value:");
n=sc.nextInt();
prog1 p1=new prog1();
o=p1.sum(m,n);
System.out.println(" sum is:"+o);
o=p1.sub(m,n);
System.out.println(" subtraction is:"+o);
o=p1.mul(m,n);
System.out.println(" multiplication is:"+o);
o=p1.div(m,n);
System.out.println(" division is:"+o);
prog22 p2=new prog22();
p2.show();
p2.display();
prog333 p3=new prog333();
p3.show();
p3.view();
p3.output();
prog4 p4=new prog4();
p4.out();
	}

}