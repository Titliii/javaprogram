import java.util.Scanner;
class Pitersion
{
int a,b,s=1,n,sum=0;
int i,r;
Pitersion(int x)
{
n=x;
}
void result()
{
b=n;
while(n!=0)
{
r=n%10;
a=r;
s=1;
for(i=1;i<=a;i++)
{
s=s*i;
}
sum=sum+s;
n=n/10;
}
if(b==sum)
System.out.println("armstrong no"+" "+sum);
else
System.out.println("not a armstrong no"+" "+sum);
}
}
class Pitersionnumber
{
public static void main(String arr[])
{
int x;
Scanner S=new Scanner(System.in);
System.out.println("enter no");
x=S.nextInt();
Pitersion ob=new Pitersion(x);
ob.result();
}
}