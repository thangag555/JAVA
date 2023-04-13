import java.io.*;
import java.util.*;

class quadrilateral
{
void quad()
{

}
}

class square extends quadrilateral
{
void sq(int a)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
System.out.println("square"+a*a);
}
}

class rectangle extends quadrilateral
{
void rec(int b,int c)
{
Scanner s=new Scanner(System.in);
int b=s.nextInt();
int c=s.nextInt();
System.out.println("rectangle"+b*c);
}
}

public class Inheritancehierarchy
{
public static void main(String args[])
{
rectangle r=new rectangle();
r.rec(3,3);

}
}
