import java.util.Scanner;
class year
{
int a;
void show(int x)
{
a=x;
if(a%100==0)
{
if(a%400==0)
{
System.out.println("leap year"+a);
}
else
{
System.out.println("not leap year"+a);
}
}
else
{
if(a%4==0)
{
System.out.println("leap year"+a);
}
else
{
System.out.println("not leap year"+a);
}
}
}
}
class leapyear
{
public static void main(String arr[])
{
int x;
Scanner S=new Scanner(System.in);
System.out.println("enter year");
x=S.nextInt();
year ob=new year();
ob.show(x);
}
}
