package dasassignment1;

import java.util.Arrays;
import java.util.Scanner;
public class Question3 {
public static int linearsearch(int arr[],int key)
{
	int count = 0;
	for(int i = 0;i<arr.length;i++)
	{	count++;
		if(key==arr[i])
		{
			return count;
		}
		
	}
	return count;
}
public static int binarysearch(int[] arr, int key) {
	int left = 0;
	int right = arr.length-1;
	int count=0;
	while(left<right)
	{
		
		
		
		
		count++;
		int mid = (left + right)/2;
		if(key==arr[mid])
		{
			return count;
		}
		else if(key<arr[mid])
		{
			right = mid-1;
		}
		else
		{
			left = mid +1;
		}
	}
	return count;
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,20,30,40,50,60,70,90};
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter the Number to found: ");
		int key=sc.nextInt();
		sc.nextLine();
		
		int linearcomparison=linearsearch(arr,key);
		int binarycomparison = binarysearch(arr,key);
		System.out.println("LInear search comparisons: "+linearcomparison);
		System.out.println("Binary search comparisons: "+binarycomparison);
	}
}
