//TO GET AN INTEGER,FLOAT,STRING FROM USER IN SAME PROGRAM:

import java.io.*;
import java.util.*;
public class Getinput
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
System.out.println("Enter the integer");
int x=a.nextInt();
System.out.println("Integer is=" +x);

System.out.println("Enter the float");
float y=a.nextFloat();
System.out.println("flaot number is=" +String.format("%.2f",y));

System.out.println("Enter the String");
a.nextLine();
String c=a.nextLine();
System.out.println("String is:"+c);

System.out.println("Enter the charcter");
char d=a.next().charAt(0);
System.out.println("Character  is:"+d);
}
}
