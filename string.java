import java.util.*;
import java.lang.*;

class string
{
	public static void main(String arr[])
	{
		String s1,s2,s3,s4,s5,s6,s7,s8;
		boolean b1;
		char c1;
		int i1,i2,i3;
		Scanner S=new Scanner(System.in);
		s1=S.next();
		s2=S.next();
		System.out.println("1st string"+" "+s1);
		System.out.println("2nd string"+" "+s2);
		s3=s1.toLowerCase();
		System.out.println("convert 1st string into lowercase"+" "+s3);
		s4=s1.replace('C','E');
		System.out.println("replace c with e in string 1"+" "+s4);
		s5=s1.replace('S','E');
		System.out.println("replace s with e in string 1"+" "+s5);
		s6=s1.trim();
		System.out.println("trim white spaces"+" "+s6);
		b1=s1.equals(s2);
		System.out.println("showing boolean value s1 and s2 are same or not"+" "+b1);
		c1=s1.charAt(2);
		System.out.println("print 2nd position of string"+" "+c1);
		i1=s1.length();
		System.out.println("print the length of s1"+" "+i1);
		i2=s1.compareTo(s2);
		System.out.println("camparing s1 with s2"+" "+i2);
		s7=s1.concat(s2);
		System.out.println("cancatinating s1 and s2"+" "+s7);
		s8=s1.substring(1,3);
		System.out.println("showing substring 1st to 3rd position"+" "+s8);
		//s1=String.Valueof(CSE);
		//i3=s1.indexof(0);
		//System.out.println(i3);
		
		
		
	}
}
		