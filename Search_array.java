import java.util.Scanner;
class s_array
{
	int i,n,c,p;
	s_array(int y)
	{
		n=y;
	}
	void result(int b)
	{
		Scanner A= new Scanner(System.in);
		int[] a= new int[n];
		System.out.println("enter the values");
		for(i=0;i<a.length;i++)
		{
			a[i]=A.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				c=a[i];
				p=i;
				break;
			}
		}
		if(p!=-1)
		{
			System.out.println("value is in the array");
		}
		else
		{
			System.out.println("value is not in the array");
		}
	}
}
class Search_array
{
	public static void main(String arr[])
	{
		int b,y;
		Scanner S=new Scanner(System.in);
		System.out.println("enter the size of the array");
		y=S.nextInt();
		System.out.println("enter the search element");
		b=S.nextInt();
		s_array ob=new s_array(y);
		ob.result(b);
	}
}