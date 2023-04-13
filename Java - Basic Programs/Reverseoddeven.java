import java.io.*;
import java.util.*;
class Reverseoddeven
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i=1;
int rem;
int out=0;
while(n>0)
{
rem=n%10;
n=n/10;
out=rem;
}
if(out%2==0)
{
System.out.println("even");
}
else{
System.out.println("odd");
}
}
}
