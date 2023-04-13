import java.io.*;
import java.util.*;
class Tables
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the positive integer:");
int a=s.nextInt();
int i;
for(i=1;i<=10;i++)
{
int b=a*i;
System.out.printf("%d*%d=%d\n",a,i,b);
}
}
}