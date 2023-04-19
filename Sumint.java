import java.util.*;
class Sumint
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
int sum=x+y;
System.out.println("Sum of first two integers:"+sum);
System.out.println("the result is:"+sumoftwo(x,y,z));
}
public static boolean sumoftwo(int p,int q,int r)
{
 return(p+q)==r||(q+r)==p||(r+p)==q;
 }
}