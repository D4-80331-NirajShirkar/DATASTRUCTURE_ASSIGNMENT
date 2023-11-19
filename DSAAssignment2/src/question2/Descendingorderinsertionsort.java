package question2;

import java.util.Arrays;

public class Descendingorderinsertionsort {
	public static void insertsionsort(int arr[],int N)
	{
		for(int i=1;i<N;i++)
		{
			int temp = arr[i];
			int j;
			for(j=i-1;j>=0 && arr[j]<temp;j--)
			{
				arr[j+1]=arr[j];
				
			}
			arr[j+1]=temp;
		}	
	}
public static void main(String[] args)
{
	int arr[] = {10,9,2,11,8,7};
	System.out.println("Elements without sorting: "+Arrays.toString(arr));
	insertsionsort(arr,arr.length);
	System.out.println("Elements with sorting: "+Arrays.toString(arr));
}
}
