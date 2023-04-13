import java.io.*;
import java.util.*;
public class Pattn
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int inp=s.nextInt();
for(int i=1;i<=inp;i++,System.out.println("\n"))
{
for(int j=1;j<=inp+1;j++)
{
if(i==1)
{
System.out.print("@");
}
if(i==5){
System.out.print("@");
}
if(i==2 && j==5)
{
System.out.print("   ## ");
}
if(i==3 && j==3)
{
System.out.print("  ##  ");
}
if(i==4 && j==1)
{
System.out.print("## ");
}
}
}
}
}

