//4.
/Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters

class triangle2
{
	int s1,s2,s3,area,peri;
	triangle2(int x, int y, int z) //constructor
	{
		this.s1=x;
		this.s2=y;
		this.s3=z;
		area = ((s2*s3)/2);
		peri = (s1+s2+s3);
System.out.println("\n The Area is : "+area+" \n The Perimeter is : "+peri);
	}
	
	public static void main(String[] args)
	{
		triangle2 t2=new triangle2(3,4,5);
	}
}