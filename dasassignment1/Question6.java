package dasassignment1;

import java.util.Scanner;

public class Question6 {
	
	public static int linearsearch(int []arr,int elementtobefound,int occurence)
	{
		int count = 0;
		for(int i=0;i<0;i++)
		{
			
			if(arr[i]==elementtobefound)
			{
				count++;
				if(count == occurence)
				{
					return i;
					
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[]= {10,10,20,20,20,45,40,41};
		System.out.println("THe element to be found: ");
		int elementtobefound = sc.nextInt();
		System.out.println("The number of occurence to be found: ");
		int occurence = sc.nextInt();
		int result = linearsearch(arr,elementtobefound,occurence);
		if(result!=-1)
		{
			System.out.println("The element of "+elementtobefound+"is found at"+result);
		}
		else
		{
			System.out.println("the element is not found");
		}
	}

}
