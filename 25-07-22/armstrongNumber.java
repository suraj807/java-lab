//Program to find 
import java.util.Scanner;
class armstrongNumber
{
public static void main(String args[])
{
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number to check wheteher it is Armstrong or not?");
	num = sc.nextInt();
	boolean ans = armstrong(num);
	if(ans==true)
	{
		System.out.println(num+" is an armstrong nummber.");
	}
	else 
	{
		System.out.println(num+" is not an armstrong number.");
	}
}
public static boolean armstrong(int var)
{
	int count=0,rem=0,i,temp=0,var2=var;
	boolean flag;
	while(var!=0)
	{
		var=var/10;
		count++;
	}
	while(var!=0)
	{
		rem = var%10;
		for(i=1;i<=count;i++)
		{
			temp+= (rem*rem);
		}
		var = var/10;	 
	}
	//System.out.println();
	if(temp == var2)
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