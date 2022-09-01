


package suraj;

import java.util.Scanner;
import java.util.stream.Stream;

public class DivisibleFiveStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Divisible to 5 \nEnter how many you want to print : ");
		int no = scan.nextInt();
		System.out.println("First "+no+" Divisible of 5 : ");
		
		// demonstration of Stream Iterate, filter method, limit method and forEach method
		// limit method is used to control the no of iteration of stream Iterator
		// to print first 20 the Divisible of 5
		Stream.iterate(1,i->i+1).filter(i->i%5==0).limit(no).forEach(System.out::println);
		
		//closing scanner object
		scan.close();
	}

}
