package question4;

import java.util.Arrays;

public class StackDescending {
private int arr[];
private int top;
private final int SIZE;
public StackDescending( int size) {
	SIZE = size;
	top = size-1;
	arr = new int[SIZE];
}
public void push(int value)
{
	if(top>=0)
	{
		arr[top]=value;
		top--;
	}
	else
	{
		System.out.println("Stack overflow");
	}
}
public void pop()
{
	if(top<SIZE-1)
	{
		top++;
		
	}
}
public void display()
{
	for(int i = 0;i<SIZE;i++)
	{
		System.out.println(arr[i]);
	}
}
}
