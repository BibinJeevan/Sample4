import java.io.*;
class CreateFile
{
public static void main(String args[])
{
try
{
FileWriter fw=new FileWriter("co6exp2.txt");
fw.write("This is experiment 2 of co6.This is my file content");
fw.close();
System.out.println("\n File Write done");
char c;
FileReader fr=new FileReader("co6exp2.txt");
BufferedReader in=new BufferedReader(fr);
String line=in.readLine();
while(line!=null)
{
System.out.println(line);
line=in.readLine();
}
in.close();
fr.close();
}
catch(IOException e)
{
System.out.println("There are some exceptions");
}
}
}