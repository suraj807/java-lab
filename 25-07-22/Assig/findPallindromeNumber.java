//Program to find a number is pallindrome number or not?
import java.util.*;
class findPallindromeNumber
{
	public static void main(String args[])
 	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is pallindrome or not?");
		num = sc.nextInt();
		boolean ans = pallindrome(num);
            if(ans == true)
		{
			System.out.println(num+" is a pallindrome number.");
		}
		else
		{
			System.out.println(num+" is NOT a pallindrome number.");
		}
	}
	public static boolean pallindrome(int var)
	{
		int temp=0,rem=0;
  		int var2 = var;
		boolean flag;
		while(var!=0)
		{
			rem = var%10;
			temp = temp*10+rem;
			var = var/10;
		}
		if(temp==var2)
		{
			flag = true;
		}
		else
		{
			flag = false;
		}
		return flag;
	}
}