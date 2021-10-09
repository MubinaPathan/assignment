//6.
//rite a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
import java.util.*;
class Area{
	static int l,b; 
public void setDim(int length , int breadth)
{
l=length;
b=breadth;
}

 int getArea(int l, int b)
{
int area;
area =l*b;

return area;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Area a1=new Area();
System.out.println("enter length");
int l=sc.nextInt();
System.out.println("enter breadth");
int b=sc.nextInt();
System.out.println("area of rectangle is : " +a1.getArea(l,b));
}
}


