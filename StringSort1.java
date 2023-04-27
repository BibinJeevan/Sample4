import java.util.*;
class StringSort1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String temp;
  System.out.println("Enter the no of Strings:");
  int max=Integer.parseInt(sc.nextLine());
  String[] str=new String[max];
  System.out.println("Enter the Strings:");
  for(int i=0;i<max;i++)
  {
   str[i]=sc.nextLine();
  }
  System.out.println("Before Sort:");
  System.out.println(Arrays.toString(str)+"\t");
  for(int i=0;i<max;i++)
  {
   for(int j=i+1;j<max;j++)
   {
    if(str[i].compareTo(str[j])>0)
    {
     temp=str[i];
     str[i]=str[j];
     str[j]=temp;
    }
   }
 }  
 System.out.println("\nAfter Sort:");
 System.out.println(Arrays.toString(str)+"\t");
}
}