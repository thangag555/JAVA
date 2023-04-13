import java.util.*;
public class Reverse_add
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a;
//int b;
for(int i=0;i<n;i++)
{
a=n%10;
a=n/10;
}
System.out.printf("%d",a);
if(a%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}