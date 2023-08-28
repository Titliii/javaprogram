import java.util.Scanner;
class Natural
{
int a,b=0,i;
Natural(int j)
{
a=i;
}
void result()
{
for(i=1;i<=a;i++)
{
b=b+i;
}
System.out.println("sum of the natural number"+" "+b);
}
}
class Naturalnumber
{
public static void main(String arr[])
{
int i;
Scanner S=new Scanner(System.in);
System.out.println("enter the value");
i=S.nextInt();
Natural ob=new Natural(i);
ob.result();
}
}