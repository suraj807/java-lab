import java.util.Scanner;
class findPrime
{
    public static void main(String args[])
	{
		int i=0,j=0,temp=0;
 		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto where you want your prime series to be printed:-");
		int getnum = sc.nextInt();
		for(i=2;i<=getnum;i++)
			{
				for(j=2;j<i;j++)	
					{
						if(i%j==0){
						temp+=1;}
					}
				if(temp==0)
					{
						System.out.println(i+" is a PRIME number.");
					}
				else
					{
						temp=0;
					}
			} 	
	}	
}