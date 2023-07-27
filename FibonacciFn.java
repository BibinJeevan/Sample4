import java.util.*;
class FibonacciFn
{
 public static void main(String args[])
 {
  int max=10;
  System.out.println("Fibonacci series of "+max+"numbers:");
  for(int i=0;i<max;i++)
  {
  System.out.println(fibonaccirecursion(i)+" ");
  }
 }
 public static int  fibonaccirecursion(int n)
 {
  if(n==0)
  {
   return 0;
  }
  if(n==1||n==2)
  {
   return 1;
  }
  return fibonaccirecursion(n-2)+fibonaccirecursion(n-1);
 }
}