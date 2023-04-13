import java.io.*;
import java.util.*;
public class Ternary
{
public static void main(String args[])
{
int a;
Scanner s=new Scanner(System.in);
a=s.nextInt();
String a1="eligible";
String a2="not eligible";
String age=(a>=18) ? a1:a2;
System.out.println(age);
}
}
