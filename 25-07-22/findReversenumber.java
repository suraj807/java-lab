//Program to find reverse of a number
import java.util.*;
class findReverseNumber
{
	public static void main(String args[])
	{
		int num;
 		Scanner sc = new Scanner(System.in);
  		System.out.println("Enter a number which you want to be reversed:- ");
 		num = sc.nextInt();
 		int var1 = reverse(num); //static mathod doesn't need object so we called it directly.
		System.out.println(var1+" is the reverse of "+num);
	}
	public static int reverse(int var)
	{
		int temp=0,rem=0;
		while(var!=0)
		{
			rem = var%10; 
			temp = temp*10+rem;
			var = var/10;
		}
		return temp;
	} 
}