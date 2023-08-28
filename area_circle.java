import java.util.Scanner;
class area_circle
{
public static void main(String arr[])
{
float a,b,c;
Scanner S=new Scanner(System.in);
a=3.14F;
System.out.println("enter radius");
b=S.nextFloat();
c=a*(b*b);
System.out.println(c);
}
}