import java.util.Scanner;
class am
{
public static void main(String args[])
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter number:");
int n,t,c=0,r;
double s=0;
n=kb.nextInt();
t=n;
while(t!=0)
{
c++;
t=t/10;
}
t=n;
while(t!=0)
{
r=t%10;
s=s+Math.pow(r,c);
t=t/10;
}
if(s==n)
{
System.out.println(n+" is armstrong number");
}
else
{
System.out.println(n+" is not armstrong number");
}
}
}

