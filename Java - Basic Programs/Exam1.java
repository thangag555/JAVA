import java.io.*;
import java.util.*;
public class Exam1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();
int total=x+y+z;
if(x>=55 && y>=65 && z>=50 && total>=180)
{
System.out.println("eligible");
}
else
{
System.out.println("not eligible");
}
}
}