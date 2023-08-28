import java.util.*;
class twoDfigure
{
	double d1,d2;
	twoDfigure(double a, double b)
	{
		d1=a;
		d2=b;
	}
void cal_area()
{
System.out.println("area is undefined");
}
}
class rectangle extends twoDfigure
{
double area;
rectangle(double a,double b)
{
super(a,b);
area=d1*d2;

}
void display()
{
System.out.println(area);
}
}
class triangle extends rectangle
{
double tri_area;
void tri_display()
{
tri_area=(d1*d2)/2;

System.out.println(tri_area);
}
}
class area_demo
{
public static void main(String arr[])
{
//Scanner S=new Scanner(System.in);
//double d1=S.nextDouble();
//double d2=S.nextDouble();
rectangle ob=new rectangle(10,20);
triangle obc=new triangle();
obc.tri_display();
ob.cal_area();
ob.display();
}
}