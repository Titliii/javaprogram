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
int[][] b=new int[m][n];
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
  b[j][i]=a[i][j];
 }
}
System.out.println("transpose matrix");
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
  {
    System.out.print(b[i][j]+" ");
  }
  System.out.println();
}
}
}
class transpose_array
{
public static void main(String arr[])
{
array ab=new array();
ab.result();
}
}