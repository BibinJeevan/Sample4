import java.util.*;
class Pal
{
public static void main(String args[])
{
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter the String:");
 String str=obj.nextLine();
 int size=str.length();
 boolean isPalindrome=true;
 for(int i=0;i<size/2;i++)
 {
  if(str.charAt(i)==str.charAt(size-i-1))
   continue;
  else
  {
   isPalindrome=false;
   break;
  }
 }
 if(isPalindrome)
  System.out.println("The String "+str+" is palindrome");
 else
  System.out.println("The String "+str+" is not palindrome");
 }
}