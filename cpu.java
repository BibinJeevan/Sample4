import java.util.*;
class cpu
{
 double price;
 class processor
 {
  int cores;
  String manufacturer;
  void show()
  {
   System.out.println("\nPrice="+price+"\nCores="+cores+"\nManufacturer="+manufacturer);
  }
 }
 static class RAM
 {
  String memory;
  String manufacturer; 
  void show()
  {
   System.out.println("Memory="+memory+"\nRAM Manufacturer="+manufacturer);
  }
 }
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 cpu cpu=new cpu();
 System.out.println("Enter the details:");
 System.out.println("Price of cpu:");
 cpu.price=Integer.parseInt(sc.nextLine());
 processor pro=cpu.new processor();
 System.out.println("Enter the no of cores:");
 pro.cores=Integer.parseInt(sc.nextLine());
 System.out.println("Enter processor manufacturer:");
 pro.manufacturer=sc.nextLine();
 RAM ram=new RAM();
 System.out.println("Enter RAM memory:");
 ram.memory=sc.nextLine();
 System.out.println("Enter RAM manufacturer:");
 ram.manufacturer=sc.nextLine();
 pro.show();
 ram.show();
}
}