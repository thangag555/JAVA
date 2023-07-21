import java.util.*;
class finger_problem
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
if(num<=0)
{
System.out.println("invalid");
}
else
{
int a=num%8;
if(a>5)
{
a=a-10;
}
else if(a==0)
{
 System.out.println("index finger");
}
switch(a)
{
case 1:
System.out.println("thumb");
break;
case 2:
System.out.println("index");
break;
case 3:
System.out.println("mid");
break;
case 4:
System.out.println("ring");
break;
case 5:
System.out.println("little");
break;
}
}










}
}