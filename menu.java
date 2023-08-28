import java.util.Scanner;
class A
	{
		int a,b,c,d;
		void x()
			{
			do
			{
				System.out.println("enter 1 for sum");
				System.out.println("enter 2 for difference");
				System.out.println("enter your choice");
				Scanner S=new Scanner(System.in);
				a=S.nextInt();
				System.out.println("enter 1st int");
				b=S.nextInt();
				System.out.println("enter 2nd int");
				c=S.nextInt();
				switch(a)
				{
					case 1: d=b+c;
					System.out.println("sum= "+d);
					break;
					case 2: d=b-c;
					System.out.println("difference= "+d);
					break;
					default:
					System.out.println("enter a valid option");
					break;
				
				}
				System.out.println("to continue press 4\n");
				int e=S.nextInt();
			}
			while(a!=4);
			//System.out.println("menu end");	
			}
	}
class menu
{
	public static void main(String arr[])
	{
		A ob=new A();
		ob.x();
	}
}