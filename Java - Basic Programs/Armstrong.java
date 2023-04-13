import java.io.*;
import java.util.*;
class Armstrong
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int a=s.nextInt();
int ans=a,rem,res=0;
while(a!=0)
{
rem=a%10;
a=a/10;
res=res+rem*rem*rem;
}
if(res==ans)
{
System.out.println("it is armstrong number");
}
else{
System.out.println("it is not an armstrong number");
}
}
}