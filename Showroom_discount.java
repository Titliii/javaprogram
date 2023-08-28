import java.util.Scanner;
class Showroom
{
float a,b,total;
double t_amount;
Showroom(float x,float y)
{
a=x;
b=y;
}
void result()
{
total=a*b;
if(total<=100)
{
t_amount=total-(total*.05);
System.out.println(t_amount);
}
else if(total>=101 && total<=200)
{
t_amount=total-((total*.05)+(total*.075));
System.out.println(t_amount);
}
else if(total>=201 && total<=300)
{
t_amount=total-((total*.075)+(total*0.1));
System.out.println(t_amount);
}
else
{t_amount=total-((total*0.1)+(total*.15));
System.out.println(t_amount);
}
}
}
class Showroom_discount
{
public static void main(String arr[])
{
float x,y;
Scanner S=new Scanner(System.in);
System.out.println("enter price");
x=S.nextFloat();
System.out.println("enter quantity");
y=S.nextFloat();
Showroom ob=new Showroom(x,y);
ob.result();
}
}