//Program to find the 2nd biggest element of the array

import java.util.*;
class checkArrayElements
{
public static void main(String args[])
{
	int size,i;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of your desired array:-");
	size = sc.nextInt();					//Here we are taking the input of size of array from the user
	int arr[] = new int[size];
	System.out.println("--Enter the elements of your array--");
	for(i=0;i<size;i++)
	{
		arr[i] = sc.nextInt();	 			//Here we are taking the input of array elements from the user
	}
	descendingarray(size,arr);
	sc.close();     					  	   //Here we closed the scanner object
}
public static void descendingarray(int len, int arr[])
{	
      int temp=0,k,j;
	for(k=0;k<len;k++)
	{
		for(j=k+1;j<len;j++)
		{		
			if(arr[k] < arr[j])      		 /* Here we are checking and sorting the elements entered by the user*/
			{
				temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
			}
		}
	}		
	System.out.println("2nd Biggest element of your array is:- "+arr[1]);  
}
}