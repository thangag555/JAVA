import java.io.*;
import java.util.*;
public class Alphapyramid
{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
char a=s.next().charAt(0);
char i,j;
for(i='A';i<=a;i++)
{
for(j='A';j<=i;j++)
{
System.out.print(i);
}
System.out.println(" ");
}
}
}