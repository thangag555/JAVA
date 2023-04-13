import java.util.*;
class Addmatrixnearelement
{
public static void main(String args[])
{
int i,j,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the row size:");
int n=sc.nextInt();
System.out.println("enter the col size:");
int x=sc.nextInt();
System.out.println("enter the elements");
int a[][]=new int[n][x];
for(i=0;i<n;i++)
    {
    for(j=0;j<n;j++)
    {
    a[i][j]=sc.nextInt();
    }
}
    for(i=0;i<n;i++)
    {
    for(j=0;j<x;j++)
    {
    if(i==n-2&&j==x-2)
    {

}
else
{
a[i][j]+=a[n-2][x-2];

}
}
} count=1;


for(i=0;i<n;i++)
{

for(j=0;j<x;j++)
{
if(count%2!=0)
{
System.out.print(a[i][j]+" ");

}
else
{
if(a[i][j]<10)
{
System.out.print("S ");
}
else
{
System.out.print("D ");

}
}

count++;
}
System.out.println(" ");

}
}
}