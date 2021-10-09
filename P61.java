//6.
//rite a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
import java.util.*;
class P61
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
 P61 p=new P61();
System.out.println("enter length");
int length=s.nextInt();


System.out.println("enter breadth");
int breadth=s.nextInt();


System.out.println("AREA="+p.getArea(length,breadth));




}
}
