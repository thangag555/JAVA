//ADD USING COMMAND LINE ARUGMENT:


import java.io.*;
public class Cmdargs
{  
public static void main(String args[])  
{  
float x = Float.parseFloat(args[0]);  
float y = Float.parseFloat(args[1]);  
float sum = x + y;  
System.out.println("The sum of x and y is: " +sum);  
}  
}  
