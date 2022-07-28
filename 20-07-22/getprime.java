import java.util.*;
class primeNumber
{
 public static void main(String args[])
 {
  int getnum,i,temp=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number to check whether it is prime or not? ");
  getnum = sc.nextInt();
	for(i=2;i<getnum;i++)
	{
		if(getnum%i==0)
  		{
        		 temp = temp+1;			
 		}
	}
	if(temp==0)
 	{
		System.out.println(getnum+" is a PRIME number.");
	}   
	else
	{
		System.out.println(getnum+" is NOT a prime number.");
	}
 }
}