//import java.io.*;
import java.util.*;
public class Reverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i;
int n=s.nextInt();
for(i=1;i<=n;i=i+2)
{
System.out.println(i);
}for(i=n;i>=1;i=i-2)
{
System.out.println(i);
}
}
}