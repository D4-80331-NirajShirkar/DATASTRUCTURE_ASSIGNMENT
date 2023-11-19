package auestion5;

import java.util.Scanner;

public class priorityoperator {
	public static int getpriority(String operator)
	{
		switch(operator)
		{
		case "+":
			return 1;
		case "-":
			return 1;
		case "*":
			return 3;
		case "/":
			return 4;
		default:
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator 1 between + - * /");
		String operator1 = sc.next();
		System.out.println("Enter the operator 1 between + - * /");
		String operator2 = sc.next();
	int priority1 = getpriority(operator1);
	int priority2 = getpriority(operator2);
		if(priority1>priority2)
			System.out.println(operator1 + "has higher priority");
		else if(priority1<priority2)
			System.out.println(operator2+" has higher priority");
		else 
			System.out.println("Both are equal ");
	}

}
