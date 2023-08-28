import java.util.*;
class room
{
	int length,breadth,area;
	room(int x,int y)
	{
		length=x;
		breadth=y;
		area=length*breadth;
	}
	void display()
	{
		System.out.println("area of the room="+area);
	}
}
class bedroom extends room
{
	int height,volume;
	bedroom(int x,int y, int z)
	{
		super(x,y);
		height=z;
		volume=length*breadth*height;
		System.out.println("volume of the room="+volume);
	}
}
class room_demo
{
	public static void main(String arr[])
	{
		bedroom ob=new bedroom(10,5,2);
		ob.display();
	}
}