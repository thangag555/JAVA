import java.io.*;
import java.util.*;
class Loopnumber
{
public static void main(String args[])
{
System.out.println("enter the number:");
Scanner s=new Scanner(System.in);
int num=s.nextInt();
for(int i=1;i<=num;i++)
{
for(int j=1;j<=num;j++)
{
System.out.printf("*");
}
System.out.println("\n");
}
}
}
