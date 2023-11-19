package dasassignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
	public static int binarysearch(int []arr,int key) {
		int left = 0;
		int right = arr.length-1;
		while(right<=left)
		{
			int mid = (left+right)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key<arr[mid])
			{
				left = mid + 1;
				
			}
			else
			{
				right = mid -1;
				
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {90,80,70,60,50,40,30,20,10};
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter the Number to found: ");
		int key=sc.nextInt();
		sc.nextLine();
		int index = binarysearch(arr,key);
		if(index!=-1)
		{
			System.out.println("Element found at: "+index);
		}
		else
		{
			System.out.println("Element not found: ");
		}
	}

}
