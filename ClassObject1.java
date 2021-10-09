//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Studen

class ClassObject1
{
	String name;
	int roll_no;
	
	public static void main (String[] args)
	{
			ClassObject1 s1 = new ClassObject1();
			s1.name="John";
			s1.roll_no=2;
System.out.println("\n\nName is: "+s1.name+" and the Roll Number is: "+s1.roll_no);
	}
	
}