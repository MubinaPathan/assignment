//8.
//Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.

import java.util.*;

class Average
{
    
   //globaal
   double a,b,c,z;

double Avg(double a, double b, double c)//Method
{
z=((a+b+c)/3);
return z;
}


public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
Average a1=new Average();

System.out.println("the average of 3 nos: "  +a1.Avg(a,b,c));

}
}