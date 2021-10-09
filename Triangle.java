//3.
//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

class Triangle

{
	 int Area;
	int peri;

	Triangle()
	{
		int len=3;
		int wid=4;
		int height=5;
		Area=((wid*height)/2);
		peri=(len+wid+height);
	}
	public static void main(String[] args)	
	{
		Triangle t1=new Triangle();
		System.out.println("\n The Area of the Triangle is : "+t1.Area+" and the Perimeter is : "+t1.peri);
		
	}
}