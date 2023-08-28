import java.util.Scanner;
class XYZ
{
double r,h,m,n;
float c,d;
void volume(Double a,Double b)
{
r=a;
h=b;
m=3.14*(a*a)*b;
System.out.println("volume of cylinder"+" "+m);
}
void volume(Float x,Float y)
{
c=x;
d=y;
n=0.33*3.14*(c*c)*d;
System.out.println("volume of cone"+" "+n);
}
}
class S_volume
{
public static void main(String arr[])
{
Double a,b;
Float x,y;
Scanner S=new Scanner(System.in);
System.out.println("enter radios");
a=S.nextDouble();
System.out.println("enter height");
b=S.nextDouble();
System.out.println("enter radios");
x=S.nextFloat();
System.out.println("enter height");
y=S.nextFloat();
XYZ ob=new XYZ();
XYZ je=new XYZ();
ob.volume(a,b);
je.volume(x,y);
}
}