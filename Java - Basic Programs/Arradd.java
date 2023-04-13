import java.io.*;
import java.util.*;
public class Arradd
{
public static void main(String args[])
{
int a[]={1,2,4,5,6};
int n=a.length;
for(int i=0;i<=n;i++)
{
for(int j=i+1;j<=n;j++)
{
if(a[i]+a[j]==6)
{
System.out.printf("%d %d\n",a[i],a[j]);
break;
}
}
}
}
}