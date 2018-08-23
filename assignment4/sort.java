class sort
{
public static void main(String args[])
{
int a[]={1,1,1,1,0,0,1,0};
int t;
for(int i=1;i<a.length;i++)
{
for(int j=0;j<a.length-i;j++)
{
if(a[j]>a[j+1])
{
t=a[j+1];
a[j+1]=a[j];
a[j]=t;
}
}
}
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}
}