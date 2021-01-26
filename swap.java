import java.util.*;
class swap
{
	public static void main(String s[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first value :");
		a=sc.nextInt();
		System.out.print("enter first value :");
		b=sc.nextInt();
		System.out.println("before swapping :");
		System.out.println("first value is :"+a);
		System.out.println("second value is:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping:");
		System.out.println("first value is :"+a);
		System.out.println("second value is:"+b);
		
	}
}