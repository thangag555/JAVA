import java.io.*;
import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int a=s.nextInt();
int n1=0,n2=1,n3,i;
System.out.printf("%d %d ",n1,n2);
for(i=0;i<=a;i++)
{
n3=n1+n2;
System.out.printf("%d ",n3);
n1=n2;
n2=n3;
}
}
}