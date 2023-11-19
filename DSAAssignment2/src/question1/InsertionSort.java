package question1;

public class InsertionSort {
public static int insertionsort(int arr[],int N)
{
	int count = 0;
	for(int i = 1; i < N; i++)
	{
		int temp=arr[i];
		int j;
		for(j=i-1;j>=0&&arr[j]<temp;j--)
		{
		count++;
		arr[j+1]=arr[j];
		
			}
			
		}
	return count;
}
public static void main(String[] args) {
	int arr[] = {10,9,2,11,8,7};
	int numberofcomparisons = insertionsort(arr,arr.length);
	System.out.println("NO of comparisons are: "+numberofcomparisons);
}
}
