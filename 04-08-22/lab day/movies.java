package suraj;

import java.util.Scanner;

public class movies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Movie name : ");
		String movieName = scan.nextLine();
		System.out.println("Enter start time :");
		int startTime = scan.nextInt();
		System.out.println("Enter end time : ");
		int endTime = scan.nextInt();
		System.out.println("Enter price : ");
		int price = scan.nextInt();
		
		
		movie show = new movie();
		System.out.println("Choose the operation from following option :");
		System.out.println("to add details enter   : add \n to print details enter : print");
		String choice = scan.next();
		
		
		switch(choice){
			
			case "add": show.addDetail(movieName,startTime,endTime,price);
						break;
			
						
			case "print": show.printDetail(movieName,startTime,endTime,price);
						break;
			
			default : System.out.println("Invalid Selection!");
		}
		scan.close();
	}
	}

	class movie{
		
		String Name;
		int Start,End,Price;
		
		
		public void addDetail(String name,int start,int end,int price){
			Name= name;
			Start = start;
			End = end;
			Price = price;	
			System.out.println("Movie details successfully added.");
		}
		
		
		public void printDetail(String movieName,int startTime,int endTime,int price){
			System.out.println("  TICKET  ");
			System.out.println("MOVIE  NAME  : "+movieName);
			System.out.println("Screen Time  : "+startTime+" - "+endTime+" ");
			System.out.println("TICKET PRICE : Rs."+price+" ");

	}

}
