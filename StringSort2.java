import java.util.*;
class StringSort2
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
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
  Arrays.sort(str);
  System.out.println("\nAfter Sort:");
  System.out.println(Arrays.toString(str)+"\t");
 }
}