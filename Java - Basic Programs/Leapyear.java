import java.io.*;
import java.util.*;
public class Leapyear
{
public static void main(String args[])
{
int a;
Scanner s=new Scanner(System.in);
a=s.nextInt();
if(a%4==0)
{
System.out.println("leapyear");
}
else{
System.out.println("non leapyear");
}
}
}