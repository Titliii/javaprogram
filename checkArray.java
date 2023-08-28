import java.util.Scanner;
import java.lang.Math;
class checkArray
{
public static void main(String arr[])
{
int i,n,j,k;
Scanner S= new Scanner(System.in);
System.out.println("enter the size of the array");
n=S.nextInt();
int[] a=new int[n];
int[] b=new int[n];
int[] c=new int[n];
System.out.println("enter the values");
for(i=0;i<a.length;i++)
 {
  a[i]=S.nextInt();
 }
 j=0;
 k=0;
 for(i=0;i<a.length;i++)
 {
   if(a[i]%2==0)
   {
    b[j]=a[i];
    j++;
   }
   else
   {
     c[k]=a[i];
     k++;
   }
}
System.out.println( "even array");
for(i=0;i<a.length;i++)
 {
  System.out.print(b[i]+" ");
 }
System.out.println( "\nodd array");
for(i=0;i<a.length;i++)
 {
  System.out.print(c[i]+" ");
 }
}
}

