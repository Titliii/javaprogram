import java.util.Scanner;
class student
{
	String name;
	int age,roll;
	student(String name,int age)
		{
			this.name=name;
			this.age=age;
			
		}
	student(student st)
		{
			this.name=st.name;
			this.age=st.age;
		}
	void display()
	{
		System.out.println(name);
		System.out.println(age);
		//System.out.println(roll);
	}
}
class Copy
{
	public static void main(String arr[])
	{
		String x;
		int y,z;
		Scanner S=new Scanner(System.in);
		System.out.println("enter name");
		x=S.next();
		System.out.println("enter age");
		y=S.nextInt();
		//System.out.println("enter roll");
		//z=S.nextInt();
		student ob=new student(x,y);
		student obc=new student(ob);
		ob.display();
		obc.display();
	}
}
		