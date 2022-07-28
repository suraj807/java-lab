import java.util.*;
class gradeSystem
{
 public static void main(String args[])
 {
  int num;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number you got to check your grade.");
  num = sc.nextInt();
  if(num<30)
  {
   System.out.println("Fail");
  }
  else if(num>=30&&num<50)
  {
   System.out.println("You got 'E' grade");
  }
  else if(num>=50&&num<60)
  {
   System.out.println("You got 'D' grade");
  }
  else if(num>=60&&num<70)
  {
   System.out.println("You got 'C' grade");
  }
  else if(num>=70&&num<80)
  {
   System.out.println("You got 'B' grade");
  }
  else if(num>=80&&num<100)
  {
   System.out.println("You got 'A' grade");
  }
  else
  {
   System.out.println("Invalid input.");
  }
 }
}