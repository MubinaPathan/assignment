//6.
//rite a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
import java.util.*;
class rect
{
   static int a,b;
public void  setDim(int length,int breadth)
{
 a=length;
 b=breadth;
 //getArea(a,b);
 
}

public static int getArea(int a ,int b)
{
	
  int area;
    area=a*b;
    return area;
	
	
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
 Prect p=new Prect();
System.out.println("enter length");
int length=s.nextInt();


System.out.println("enter breadth");
int breadth=s.nextInt();


System.out.println("AREA="+p.getArea(length,breadth));




}
}

import java.util.*;
class Area
{
	double l,b;
	
	
	void setDim(double l, double b)
	{
		double x=l;
		double y=b;
	}
	
	double getArea(double x, double y)
	{
		double area;
		area=x*y;
		return area;
	}
	
	public static void main(String args[])
	{
		Area a1 = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth: ");
		double l1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		System.out.println("Area is: " +a1.getArea(l1,b1));
	}
}

