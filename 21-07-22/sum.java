//Program to get sum of odd number upto N.
import java.util.Scanner;
class sumOfOddNumbers
{
 public static void main(String args[])
 {
  int var=0,i,sum=0;
  Scanner sc = new Scanner(System.in); 
  System.out.println("Enter the number upto where you want to get your result:- "); 
  var = sc.nextInt();
  for(i=2;i<=var;i++)
  {
   if(i%2!=0)
   {
    sum+=i;
   }
  }
 System.out.println(sum);
 }
}