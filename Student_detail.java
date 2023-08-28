import java.util.Scanner;
class A
	{
		String name;
		int roll;
		void student()
		{
			Scanner S=new Scanner(System.in);
			System.out.println("enter name of the student");
			name=S.next();
			System.out.println("enter roll no");
			roll=S.nextInt();
		}
	}
class B extends A
	{
		String subject;
		void detail()
		{
			Scanner A= new Scanner(System.in);
			System.out.println("enter name of the subject");
			subject=A.next();
			System.out.println(subject);
			System.out.println(name);
			System.out.println(roll);
 		}
	}
class Student_detail
	{
		public static void main(String arr[])
			{
				B ob=new B();
				ob.student();
				ob.detail();

			}
	}
	