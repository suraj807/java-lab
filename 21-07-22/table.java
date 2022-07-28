import java.util.Scanner;
class table
{
 public static void main(String args[])
 {
  int num1=0,num2=0,i;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter your first number:- ");
  num1 = sc.nextInt();
  System.out.println("Enter your number upto where you want your table to be printed:- ");
  num2 = sc.nextInt();
  System.out.println("Your Required table is as follows:- "); 
  for(i=1;i<=num2;i++)
  {
   System.out.println(num1*i);
  }
 }
}