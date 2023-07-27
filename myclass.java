import java.util.*;
import java.io.*;
public class myclass
{
public static void main(String args[])
{
int i;
try
{
FileOutputStream fdd=new FileOutputStream("dataodd.txt");
FileInputStream fin=new FileInputStream("data.txt");
FileOutputStream feven=new FileOutputStream("dataeven.txt");
while((i=fin.read())!=-1)
{
if(i%2==0)
feven.write(i);
else
fdd.write(i);
}
fdd.close();
fin.close();
feven.close();
}
catch(Exception e)
{
System.out.println("There are some IOException");
}
}
}