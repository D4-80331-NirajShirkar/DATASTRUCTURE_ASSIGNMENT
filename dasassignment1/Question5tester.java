package dasassignment1;

import java.util.Scanner;

public class Question5tester {
	public static Question5 linearsearchforid(Question5 q[],int findbyid)
	{
		for(int i =0;i<q.length;i++)
		{
			if(q.equals(q)
			{
				
			}
		}
		
		return null;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Question5 q[] = new Question5[3];
		q[0]=new Question5(1,"Niraj",10000);
		q[1]=new Question5(2,"Rahul",20000);
		q[3]=new Question5(3,"Rohan",30000);
		System.out.println("Enter the Employee to be found by id:");
		int findbyid = sc.nextInt();
		Question5 foundbyid = linearsearchforid(q,findbyid);
		

	}

}
