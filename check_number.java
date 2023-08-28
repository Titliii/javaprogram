import java.util.Scanner;
import java.lang.Math;
class Number
{
double a,b,c,d,e;
Number(double x)
{
a=x;
}
void square()
{
d=a*a;
System.out.println("sq of the no"+ +d);
}
Number(double y,double z)
{
b=y;
c=z;
}
void result()
{
e=Math.pow(b,c);
System.out.println("power of the no"+ +e);
}
}
class check_number
{
public static void main(String arr[])
{
double x,y,z;
Scanner S= new Scanner(System.in);
System.out.println("enter the number");
x=S.nextDouble();
System.out.println("enter another number");
y=S.nextDouble();
System.out.println("enter the power");
z=S.nextDouble();
Number ab=new Number(x);
Number cd= new Number(y,z);
ab.square();
cd.result();
}
}