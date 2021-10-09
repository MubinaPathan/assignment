//10.Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
//Name        Year of joining        Address
//Robert            1994                64C- WallsStreat
//Sam                2000                68D- WallsStreat
//John                1999                26B- WallsStreat
import java.util.*;
 class Employee{
String  x;
  int  y;
String  z;
String Name;
int Year;
String Address;

Employee( String x, int y, String z)
{
String Name=x;
int Year=y;
String Address=z;
System.out.println("\n"+Name+"\t\t" +Year+"\t\t\t\t"+Address);
}
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name");
String x=sc.next();
System.out.println("Enter Year");
int y=sc.nextInt();
System.out.println("Enter Address");
String z=sc.next();

System.out.println("\nName\t\t Year of joining\t\t Address");

Employee a1=new Employee( x,y,z);


}
}