import java.util.*;
class PrimeRange
{
 public static void main(String args[])
 {
  int count;
  System.out.println("Enter the limits:");
  Scanner obj=new Scanner(System.in);
  int first=obj.nextInt();
  int last=obj.nextInt();
  System.out.println("Prime nos between "+first+" to "+last+" are:");
  for(int j=first;j<=last;j++)
  {
   count=0;
   for(int i=1;i<=j;i++)
   {
    if(j%i==0)
    {
     count++;
    }
   }
  if(count==2)
  {
  System.out.println(j+" ");
  }
 }
}
}