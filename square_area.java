import java.util.Scanner;
class Area
{
int a,b,c,e;
Area(int x)
{
a=x;
}
Area(int y,int e)
{
b=y;
c=e;
}
void result()
{
int w,z;
w=a*a;
z=b*c;;
System.out.println("area ofthe square"+" "+w+" "+z);
}
}
class  square_area
{
public static void main(String arr[])
{
int x,y,e;
Scanner S=new Scanner(System.in);
x=S.nextInt();
y=S.nextInt();
e=S.nextInt();
Area ab=new Area(x);
Area cd=new Area(y,e);
ab.result();
cd.result();
}
}