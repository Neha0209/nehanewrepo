import java.util.Scanner;
class rectangle
{
  int len;
  int br;
  void calculatearea(int a,int b)
  { 
    len=a;
    br=b;
    System.out.println(len*b);
  }
}

class main
{
  public static void main(String args[])
  {
     int a,b;
     Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
     b=sc.nextInt();
     rectangle r=new rectangle();
     r.calculatearea(a,b);
  }
}