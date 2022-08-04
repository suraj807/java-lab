package suraj;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the no of element : ");
				int size = scan.nextInt();
				int arr[];
				
				
				arr = new int[size];
				System.out.println("Enter "+size+" Numbers :");
				
				
				for(int i=0;i<size;i++){
					arr[i] = scan.nextInt();
				}
				int start = arr[0];
				System.out.println("Select Operation to perform Choose from the following :");
				System.out.println("for Addition enter       : + \nfor Subtraction enter    : - \nfor Multiplication enter : * ");
				System.out.println("for Division enter       : /");
				
				char choice = scan.next().charAt(0);
				
				
				switch(choice){
					case '+' : addition(arr);
								break;
					case '-' : subtraction(start,arr);
								break;
					case '*' : multiplication(arr);
								break;
					case '/' : division(start,arr);
								break;
					default : System.out.println("Invalid selection!!");
				}
				scan.close();
			}
			
			
			public static void addition(int ...args){
				int result = 0;
				System.out.print("Addition of elements : ");
				
				 
				for(int x:args)
				{
					result +=x;
				}
				System.out.println(result);
			}
			
				
			public static void subtraction(int start,int ...args){
				int result = 0;
				System.out.println("Subtraction of elements: ");
				
			
				for(int x : args)
				{
					
					if(result != 0){
						result -= x;
					}
					if (result == 0){
						result = start;
						start = 0;
					}
					
				}
				System.out.println(result);
			}
			
			
			public static void multiplication(int ...args){
				int result = 1;
				System.out.print("Multiplication of elements : ");
				
				
				for(int x:args){
					
					result *= x;
				}
				System.out.println(result);
			}
			
			
			public static void division(int start,int ...args){
				int result = 0;
				System.out.println("Division of elements: ");
				
				
				for(int x : args){
					
					if(result != 0){
						result /= x;
					}
					if (result == 0){
						result = start;
						start = 0;
					}
					
				}
				
				System.out.println(result);

	}

}
