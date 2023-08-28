\=7]\7
import java.util.Scanner;
import java.lang.Math;
class n_Array
{
public static void main(String arr[])
{
int i,n;
Scanner S= new Scanner(System.in);

System.out.println("enter the size of the array");
n=S.nextInt();
int[] a=new int[n];
System.out.println("enter the values");
for(i=0;i<a.length;i++)
{
a[i]=S.nextInt();
}
for(i=0;i<a.length;i++)
{
System.out.println(i+" "+a[i]);
}
}}