import java.util.Scanner;
class array
{
int i,j,n,m;
void result()
{
Scanner S=new Scanner(System.in);
System.out.println("enter the row");
n=S.nextInt();
System.out.println("enter the coloum");
m=S.nextInt();
int[][] a=new int[n][m];
for(i=0;i<n;i++)
{
 for(j=0;j<m;j++)
  {
   a[i][j]=S.nextInt();
  }
}
for(i=0;i<n;i++)
{
 for(j=0;j<m;j++)
  {
    System.out.print(a[i][j]+" ");
  }
  System.out.println();
}
}
}
class matrix_array
{
public static void main(String arr[])
{
array ab=new array();
ab.result();
}
}