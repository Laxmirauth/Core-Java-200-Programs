import java.util.*;
class temp
{
	Scanner sc=new Scanner(System.in);
	int a[],b[];
	int i,p,v,n,m;
	void input()
	{
		System.out.println("enter the size of array :");
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<(a.length-3);i++)
		{
			System.out.println("enter the element of array:");
			a[i]=sc.nextInt();
		}
	}
	void displayA()
	{
		System.out.println("elements of array:");
		for(i=0;i<a.length-3;i++)
			System.out.println(a[i]);
	}
	void enter()
	{
		System.out.println("enter the position where you want to insert the new value:");
		p=sc.nextInt();
		System.out.println("enter the value which you want to insert");
		v=sc.nextInt();
		m=n+1;
		b=new int[m];
		for(i=0;i<p;i++)
		{
			b[i]=a[i];
		}
		for(i=p+1;i<b.length;i++)
		{
			b[i+1]=a[i];
		}
	}
	void displayB()
	{
		System.out.println("elements of array:");
		for(i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
	
	public static void main(String s[])
	{
		temp t=new temp();
		t.input();
		t.displayA();
		t.enter();
		t.displayB();
	}
	
}