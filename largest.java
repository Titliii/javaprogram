import java.util.Scanner;
class xyz
{
int a,b,c;
void number()
{
Scanner S=new Scanner(System.in);
a=S.nextInt();
b=S.nextInt();
c=S.nextInt();
if(a>b&&a>c)
{
System.out.println(a);
}
else if(b>a&&b>c)
{
System.out.println(b);
}
else
{
System.out.println(c);
}
}
}
class largest
{
public static void main(String arr[])
{
xyz ab=new xyz();
ab.number();
}
}