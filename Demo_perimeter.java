import java.util.Scanner;
class perimeter
{  
  int length;
  int breadth;
 
  perimeter()             //default constuctor or do-nothing constructor
   {
     length=0;
     breadth=0;
   }
  
  perimeter(int x, int y) //parameterized constructor
   { 
     length=x;
     breadth=y;
   }
 void cal_perimeter()
  {
    int peri;
    peri=2*(length+breadth);
    System.out.println("Perimetr of the area is" +peri);
  }
}
class Demo_perimeter
{
 public static void main(String args[])
 {
  perimeter p1=new perimeter();      //calling default constructor
  perimeter p2=new perimeter(5,10); //calling parameterized constructor
  p1.cal_perimeter();
  p2.cal_perimeter();
 }
}