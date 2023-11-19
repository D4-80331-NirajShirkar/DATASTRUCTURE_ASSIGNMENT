package question4;

import java.util.Scanner;



public class Stackmain {

	public static void main(String[] args) {
		StackDescending st = new StackDescending(5);
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("0: EXIT\n 1: Push\n 2: Pop \n 3: Display");
			System.out.print("Enter the choice:");
			
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			
					System.out.print("Enter the data: ");
					int value = sc.nextInt();
					st.push(value);
			
				break;
			case 2: 
				 
				st.pop();
				break;
			
			case 3: 
				st.display();
				break;
			}
			
		}while(choice!=0);

		}
	}
	
	
	



