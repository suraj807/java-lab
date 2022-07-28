//Program to add all the elements of Array

import java.util.*;
class addArrayElements
{
public static void main(String args[])
{
	int size;
  	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array:-");
	size = sc.nextInt();								//Here we are taking the input of size of array. 
	int ar[] = new int[size];	
	System.out.println("--Enter the elements of array--");					
	for(int i=0;i<size;i++)								
	{
		ar[i] = sc.nextInt();							//Here we are taking input of array elements from user.  				
	}
	addArray(size,ar);
	sc.close();
}
public static void addArray(int len, int arr[])
{
	int temp=0;
	for(int k=0;k<len;k++)
	{
		temp+= arr[k];								//we are adding all the elements with one another.
	}
	System.out.println("--Result after adding all the elements of the array-- "+temp);
}
}