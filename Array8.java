import java.util.*;
public class Array8
{
	void printRepeating(int arr[], int size)
	{
		int i,j;
		System.out.println("Repeated elements are :");
		for(i=0;i<size-1;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if (arr[i] ==arr[j])
			System.out.println(arr[i] + " ");
			}
		}
	}
	public static void main(String args[])
	{
		Array8 repeat=new Array8();
		int arr[] = {4,2,4,5,2,3,1};
		int arr_size =arr.length;
		repeat.printRepeating(arr, arr_size);
	}
}