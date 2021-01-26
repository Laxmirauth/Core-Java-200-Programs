class class1 extends Thread 
{
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.print("\n\t\tText DownLoading");
		}
	}
}
class class2 extends Thread 
{
	public void run()
	{
		for(int i=1;i<=7;i++)
		{
			
			System.out.print("\n\tImage Downloading");
		}
	}
}
class class3 extends Thread 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			
			System.out.print("\n\t\t\tAudio Downloading");
		}
	}
}
class class4 extends Thread 
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			
			System.out.print("\n\tVideo Downloading");
		}
	}
}
class runs 
{
	public static void main(String s[])
	{
		class1 a=new class1();
		class2 b=new class2();
		class3 c=new class3();
		class4 d=new class4();
		
		a.start();
		b.start();
		c.start();
		d.start();
	}
}