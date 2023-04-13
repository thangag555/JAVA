import java.io.*;
import java.util.*;
class Count
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int r=s.nextInt();
int k=s.nextInt();
int out=0;
if(k==0)
{
System.out.println("not possible");
}
for(int i=l;i<=r;i++)
{
out=i/k;
}
System.out.println(out);

}
}
