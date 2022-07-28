import java.util.Scanner;
class starPattern
{
 public static void main(String args[])
 {
  int num,i,j;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of stars to get the pattern.");
  num = sc.nextInt();
  for(i=num;i>0;i--)
  {
   for(j=0;j<i;j++)
   {
    System.out.print("* "); 
   }
   System.out.println("");
  }
 }
}