import java.util.*;
class UsernameException extends Exception
{
 public UsernameException(String msg)
 {
  super(msg);
 }
}
class PasswordException extends Exception
{
 public PasswordException(String msg)
 {
  super(msg);
 }
}
 public class CheckLogin
 {
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   String Username,Password;
   System.out.println("Enter the username:");
   Username=s.nextLine();
   System.out.println("Enter the password:");
   Password=s.nextLine();
   int length=Username.length();
   try
   {
    if(length<6)
      throw new UsernameException("Username must be greater than 6 characters");
    else if(!Password.equals("hello"))
      throw new PasswordException("Incorrect Password\n Try Correct Password");
    else
      System.out.println("Login Succesfull!!");
   }
   catch(UsernameException u)
   {
    u.printStackTrace();
   }
   catch(PasswordException p)
   {
    p.printStackTrace();
   }
   finally
   {
    System.out.println("The Finally statement is executed");
   }
  }
}
