import java.util.*;
class Manipulation
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the 1st String:");
  String str=obj.nextLine();
  System.out.println("Enter the 2nd String:");
  String str2=obj.nextLine();
  System.out.println("Concatenation of String:");
  String str3=str.concat(str2);
  System.out.println(str3);
  System.out.println("Length of the 1st String:"+str.length());
  System.out.println("Character at position 4 in 1st String:"+str.charAt(4));
  System.out.println("Index of character d in 2nd String:"+str2.indexOf('d'));
  System.out.println("Convert to LowerCase:"+str3.toLowerCase());
 }
}   