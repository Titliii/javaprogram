import java.util.Scanner;
class xyz
{
int a,b,c;
void area()
{
Scanner S=new Scanner(System.in);
System.out.println("enter length");
a=S.nextInt();
System.out.println("enter width");
b=S.nextInt();
c=a*b;
System.out.println("area of the room"+" "+c);
}
}
class room
{
public static void main(String arr[])
{
xyz ab=new xyz();
ab.area();
}
}