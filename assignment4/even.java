import java.util.Scanner;
class even
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter no:");
int n;
n=sc.nextInt();
System.out.println("output: ");
for(int i=1;i<=n;i++)
{
if(i%2==0)
{
System.out.print(i+" ");
}
}
}
}
