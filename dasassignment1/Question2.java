package dasassignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
public static int linearsearch(int arr[],int key)
{
	for(int i = arr.length-1;i>0;i--)
	{
		if(arr[i]==key)
		{
			return i;
		}
	}
	
	return -1;
	
}
public static void main(String[] args)
{
	
	Scanner sc = new Scanner(System.in);
	int arr[]=new int[5];
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("Enter the element at ["+i+"]");
		arr[i]=sc.nextInt();
	}

	System.out.println("Enter the element are  "+Arrays.toString(arr));
	System.out.println("Enter the elemnr to be found: ");
	int key = sc.nextInt();
	int index = linearsearch(arr,key);
	if(index!=-1)
	{
		System.out.println("Element last index occurence at "+index);
	}
	else {
		System.out.println("Element not found");
	}
	
}
}
