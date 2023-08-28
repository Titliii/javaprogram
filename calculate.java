import java.util.Scanner;
class A
	{
			int a,b;
			void x()
		{
			Scanner S=new Scanner(System.in);
			System.out.println("enter first integer");
			a=S.nextInt();
			System.out.println("enter second integer");
			b=S.nextInt();
		}
	}
class B extends A
	{
			void y()
		{
			System.out.println("sum= "+(a+b));
			System.out.println("difference= "+(a-b));
			System.out.println("product= "+(a*b));
			System.out.println("div= "+(a/b));
		}
	}
class calculate
	{
			public static void main(String arr[])
		{
			B ob=new B();
			ob.x();
			ob.y();
		}
	}
