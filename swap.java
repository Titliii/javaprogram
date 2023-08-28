import java.util.Scanner;
class swap
{
public static void main(String arr[])
{
float a,b,c;
Scanner S=new Scanner(System.in);
a=S.nextFloat();
b=S.nextFloat();
c=a;
a=b;
b=c;
System.out.println("swap="+a+" "+b);
}
}