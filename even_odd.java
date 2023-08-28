import java.util.Scanner;
class even_odd
{
public static void main(String arr[])
{
int a;
Scanner S=new Scanner(System.in);
System.out.println("enter no");
a=S.nextInt();
if(a%2==0)
System.out.println("no is even"+a);
else
System.out.println("no is odd"+a);
}
}