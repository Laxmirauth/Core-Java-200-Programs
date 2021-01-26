class printtable
{
	public static void main (String s[])
	{
		int n, i=1, t;
		n=Integer.parseInt(s[0]);
		for(i=1;i<=10;i++)
		{
			t=n*i;
			System.out.print("\n\t"+n+"*"+i+"="+t);
		}
	}
}