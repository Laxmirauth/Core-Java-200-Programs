class overriding1
{
	void show()
	{
		System.out.println("i am show.");
	}
	void display()
	{
		System.out.println("i am in class 1.");
	}
}
class overriding2 extends overriding1
{
	void view()
	{
		System.out.println("i am view.");
	}
	void display()
	{	super.display();
		System.out.println("i am class 2.");
	}
}
class overriding3 extends overriding2
{
	void output()
	{
		System.out.println("i am output.");
	}
	void display()
	{	
		super.display();
		System.out.println("i am class 3.");
	}
}
class super
{
	public static void main(String s[])
	{
	overriding3 o=new overriding3();
	o.show();
	o.display();
	o.view();
	o.display();
	o.output();
	o.display();
	}
}