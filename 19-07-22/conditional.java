import java.util.Scanner;
class illustrateOperator
{
 public static void main(String args[])
 {
  illustrateOperator cs = new illustrateOperator();
  int var1=25,var2=85,var3=20,temp1,temp2;
  temp1 = (var1>var2) ? var1:var2;
  temp2 = (temp1>var3) ? temp1:var3;
  System.out.println(temp2+" is the highest number");
  cs.display();
 }
 int display()
 {
  int var1=23,var2=32,var3=12,var4=5,temp;
  temp = (var1>var2)&&(var1>var3)&&(var1>var4) ? var1 : (var2>var3)&&(var2>var4) ? var2 : (var3>var4) ? var3 : var4;
  System.out.println(temp+" is the highest number.");
  return 0;
 }
}