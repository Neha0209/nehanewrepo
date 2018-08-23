import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
Scanner kb=new Scanner(System.in);
int n;
System.out.println("Enter no:");
n=kb.nextInt();
int r,i=0;
int t=0;
while(n!=0)
{
r=n%10;
t=r+t*10;
i++;
n=n/10;
}
System.out.println("Reverse: "+t);
}
}
