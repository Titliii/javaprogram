import java.util.Scanner;
import java.lang.Math;
class XYZ
{
double a,m,b,c,n;
void show(Double x)
{
a=x;
m=Math.sqrt(a);
System.out.println("squareroot of the no is"+" "+m);
}
void show(Double y,Double z)
{
b=y;
c=z;
n=Math.pow(b,c);
System.out.println("power of the no is"+" "+n);
}
}
class Function
{
public static void main(String arr[])
{Double x,y,z;
Scanner S=new Scanner(System.in);
System.out.println("enter no");
x=S.nextDouble();
System.out.println("enter no");
y=S.nextDouble();
System.out.println("enter pow");
z=S.nextDouble();
XYZ ob=new XYZ();
XYZ ab=new XYZ();
ob.show(x);
ab.show(y,z);
}
}