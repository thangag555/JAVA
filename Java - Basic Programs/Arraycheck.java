import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Arraycheck
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the size1:");
int n1=s.nextInt();
int a[]=new int[n1];
int i;
for(i=0;i<n1;i++)
{
a[i]=s.nextInt();
}
System.out.println("enter the size2:");
int n2=s.nextInt();
int b[]=new int[n2];
int j;
for(j=0;j<n2;j++)
{
b[j]=s.nextInt();
}
if(Arrays.equals(a,b))
{
System.out.println("equal");
}
else{
System.out.println("not equal");
}
}
}
