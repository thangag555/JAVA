//ADDITION OF TWO NUMBERS GETTING INPUT FROM THE USER:

import java.io.*;
import java.util.*;
public class Addition
{
public static void main(String []args)
{
Scanner a=new Scanner(System.in);
System.out.println("Enter the number1");
double n1=a.nextDouble();
System.out.println("Enter the number2");
double n2=a.nextDouble();
double add=n1+n2;
System.out.println("The addition of two numbers are="+String.format("%.3f",add));
}
}
