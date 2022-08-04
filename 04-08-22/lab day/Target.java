package suraj;

import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the Size of array:");
				int size = s.nextInt();
				
				
				int arr[];
				arr = new int[size];
				System.out.println("Enter "+size+" elements :");	
				
				
				for(int i=0;i<size;i++){
					arr[i]= s.nextInt();
				}
				System.out.println("Enter the Sum of two number : ");
				int target = s.nextInt();
				
				
				search obj = new search();
				System.out.println("-----------------------------");
				
			
				obj.Sum(arr,size,target);
				s.close();
			}
		}

		
		class search{
			public void Sum(int arr[],int size,int target){
				int lenght = size;
				int[] result;
				
			
				result = new int[2];
				
			
				for(int i=0;i<lenght;i++)
					{
						for(int j=i+1;j<lenght;j++)
						{
					
						if(target == arr[i]+arr[j])
						{
							result[0]=arr[i];
							result[1]=arr[j];
							
						
							System.out.print("Element: ["+result[0]+","+result[1]+"]");
							System.out.println("  Index :["+i+","+j+"]");
						}
					}
				}

	}

}
