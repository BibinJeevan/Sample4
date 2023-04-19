import java.util.*;
class Swap2
{
public static void main(String args[])
{
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter the First no:");
 int num1=obj.nextInt();
 System.out.println("Enter the Second no:");
 int num2=obj.nextInt();
 num1=num1+num2;
 num2=num1-num2;
 num1=num1-num2;
 System.out.println("First no:"+num1);
 System.out.println("Second no:"+num2);
}
}