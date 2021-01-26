import java.util.*;
class transpose
{
	int a[][],t[][];
	int i,j,c,r;
	void input()
	{
		Scanner sc= new Scanner(System.in);
	    System.out.println("enter the number of rows and columns of matrix");
		r=sc.nextInt();
		c=sc.nextInt();
		a=new int[r][c];
		t=new int[r][c];
		System.out.println("enter the vlaues of matrix ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	void transpos()
	{
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				t[i][j]=a[j][i];
			}
		}
	}
	void display()
	{
		System.out.println("original matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("transpose of matrix :");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("\t"+t[i][j]);
			}
			System.out.print("\n");
		}
	}
	public static void main(String s[])
	{
		transpose tr=new transpose();
		tr.input();
		tr.transpos();
		tr.display();
	}
}