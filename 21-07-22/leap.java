class checkLeapYear
{
 public static void main(String args[])
 {
  int i;
  for(i=1947;i<=2022;i++)
  {
   if(i%4==0 || i%100==0)
   {
		System.out.println(i+"It's a leap year");   
   }
  }
 }
}