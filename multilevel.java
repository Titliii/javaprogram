import java.util.Scanner;
import java.lang.Math;
class A
{
	Double a,b,c;
	void take()
	{
		Scanner S=new Scanner(System.in);
		System.out.println("enter first integer");
		a=S.nextDouble();
		System.out.println("enter second integer");
		b=S.nextDouble();
	}
}
class B extends A
{
	void swap()
	{
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}
}
class C extends B
{
	void power()
	{
		double d=Math.pow(a,b);
		System.out.println(d);
		double e=Math.pow(b,a);
		System.out.println(e);
	}
}
class multilevel
{
	public static void main(String arr[])
	{
		C cd=new C();
		cd.take();
		cd.swap();
		cd.power();
	}
}
