import java.io.*;
import java.util.*;
class Reversenumber
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int a=s.nextInt();
int r;
while(a!=0)
{
r=a%10;
a=a/10;
System.out.printf("%d",r);
}
}
}