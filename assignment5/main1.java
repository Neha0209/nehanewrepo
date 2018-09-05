import java.util.Scanner;
class complex
{
  int real;
  int img;
  void show(int a,int b)
  { 
    real=a;
    img=b;
    System.out.println(real+"+i"+img);
  }
}

class main1
{
  public static void main(String args[])
  {
     int a,b;
     Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
     b=sc.nextInt();
     complex c=new complex();
     c.show(a,b);
  }
}