//Program to find factorial of a program.
import java.util.*;
class factorialProgram
{
	public static void main(String args[])
 	{
  		int num;
  		Scanner sc = new Scanner(System.in);
  		System.out.println("Enter a number to find it's factorial:- ");
  		num = sc.nextInt();
  		factorialProgram obj = new factorialProgram(); // Object created of class factorialProgram to call fact method.
  		obj.fact(num); 
 	}
 		public void fact(int var)
 		{
   			int num,i,ans=1;
   			for(i=1;i<=var;i++)
  			{
    				ans = ans*i;
  			}
  			System.out.println(ans+" is the factorial of"+var);
 		}
}