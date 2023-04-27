import java.util.*;
class Complexnum
{
 int real,img;
 Complexnum(int real,int img)
 {
  this.real=real;
  this.img=img;
 }
 void show()
 {
  System.out.println("Complex Number="+this.real+"+"+this.img+"i");
 }
 public static Complexnum add(Complexnum n1,Complexnum n2)
 {
  Complexnum result=new Complexnum(0,0); 
  result.real=n1.real+n2.real;
  result.img=n1.img+n2.img;
  return result;
 }
 public static void main(String args[])
 {
  Complexnum[] c=new Complexnum[2];
  Scanner sc=new Scanner(System.in);
  int l_real,l_img;
  for(int i=0;i<2;i++)
  {
   System.out.println("Complex no"+(i+1)+"Real:");
   l_real=sc.nextInt();
   System.out.println("Complex no"+(i+1)+"Img:");
   l_img=sc.nextInt();
   c[i]=new Complexnum(l_real,l_img);
  }
   Complexnum result=add(c[0],c[1]);
   System.out.println("After addition\n Result is:");
   result.show();
}
}
