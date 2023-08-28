import java.util.Scanner;
import java.lang.Math;
class Armstrong
{
double x,r,p=0.0,t;
Armstrong(Double a)
{
x=a;
}
void result()   
{
t=x;
while(x>0)
{
r=x%10;
p=p+Math.pow(r,3);
x=x/10;
}
if(t==p)
System.out.println("armstrong number"+" "+p);
else
System.out.println("not armstrong number"+" "+p);
}
}
class armstrongnumber
{
public static void main(String arr[])
{
double a;
Scanner S=new Scanner(System.in);
a=S.nextDouble();
Armstrong ob=new Armstrong(a);
ob.result();
}
}