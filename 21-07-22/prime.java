class checkPrime
{
 public static void main(String args[])
 {
  int num=9,i,temp=0;
  if(num==0||num==1){
  System.out.println("NOT a Prime");}
  for(i=2;i<num;i++)
  {
   if(num%i==0)
   {
    temp+=1;
   } 		
  }
  if(temp>0)
  {
   System.out.println(i+" is NOT a prime number");
  }
  else 
  {
   System.out.println(i+" IT'S a prime number");
  }
 }
}