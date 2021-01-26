class star
{
	public static void main(String s[])
	{
		int n, i,j;
		n=Integer.parseInt(s[0]);
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}