import java.util.*;
import java.lang.Math;
class Armstrong
{
static void isArmstrong(int n)
{
 int temp,digits=0,last=0,sum=0;
 temp=n;
 while(temp>0)
 {
  temp=temp/10;
  digits++;
 }
 temp=n;
 while(temp>0)
 {
  last=temp%10;
  sum+=(Math.pow(last,digits));
  temp=temp/10;
 }
 if(n==sum)
  System.out.println("Is Armstrong");
 else
  System.out.println("Is not Armstrong");
}
public static void main(String args[])
{
 int num;
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter the no:");
 num=obj.nextInt();
 isArmstrong(num);
}
}