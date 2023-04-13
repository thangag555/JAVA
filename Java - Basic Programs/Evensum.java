//even sum
import java.io.*;
import java.util.*;
public class Evensum
{
public static void main(String args[])
{
System.out.println("enter the value:");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=1;
int i=1;
while(i<=n)
{
sum=sum+i;
i=i+1;
}
System.out.println(sum);
}
}