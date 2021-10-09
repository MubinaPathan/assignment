//3.
//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
class Rectangle
{
 int length;
 int breath;
 int area;
 Rectangle(int x ,int y)
   {
	length = x;
	breath = y;
   }
   public int area()
{
	area = length*breath;
	return area;
}

public int area1()
{
	area = length*breath;
	return area;
}

public static void main(String [] args)
{
	Rectangle area = new Rectangle(4,5);
	Rectangle area1 = new Rectangle(5,8);
	
	System.out.println(area.area());
	System.out.println(area1.area());
	
}

}
