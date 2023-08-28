import java.util.Scanner;
import java.lang.Math;
class Armstrong
{
int n,x,r,t1,t2,count=0,t3;
Double ar=0.0;
Armstrong(int x)
{
n=x;
}
void result()
{t1=n;
t2=n;
while(n!=0)
{
n=n/10;
count++;
}
while(t1>0)
{
r=t1%10;
ar=ar+Math.pow(r,count);
t1=t1/10;
}

if(ar==t2)
System.out.println("this is a armstrong no"+" "+t2);
else
System.out.println("this is not a armstrong no"+" "+t2);
}
}
class Armstrong_n_number
{
public static void main(String arr[])
{
int x;
Scanner S=new Scanner(System.in);
System.out.println("enter no");
x=S.nextInt();
Armstrong ob=new Armstrong(x);
ob.result();
}
}