import java.util.*;
class Smallest
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter 1st no:");
int x=in.nextInt();
System.out.println("Enter 2nd no:");
int y=in.nextInt();
System.out.println("Enter 3rd no:");
int z=in.nextInt();
System.out.println("The Smallest value is:"+small(x,y,x)+"\n");
}
public static int small(int x,int y,int z)
{
 return Math.min(Math.min(x,y),z);
 }
}