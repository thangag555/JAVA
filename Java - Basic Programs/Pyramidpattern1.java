import java.io.*;
import java.util.*;
class Pyramidpattern1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int i,j;
for(i=1;i<=4;i++)
{
for(j=4;j>i;j--)
{
System.out.printf(" ");
}
for(j=1;j<=i;j++)
{
System.out.printf("%d  ",j);
}
System.out.println("");
}
}
}