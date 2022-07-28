package suraj;

import java.util.Scanner;

public class Duplicatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your size  number:");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter "+size+" number :");
		
		for (int i=0;i<size;i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("output");
		duplicateElement(size,arr); 
		scan.close();
	}

	
	public static void duplicateElement(int size,int arr[])
	{	
		int duplicate=0;
		
		for(int i=0;i<size;i++)
		{
			for(int j= i+1;j<size;j++)
			{
				
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]+" is the duplicate number.");
					duplicate++;			
				}
			}
		}
		System.out.println("No of duplicate number : "+duplicate);
	}

}
