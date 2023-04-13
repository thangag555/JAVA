//AREA OF RECTANGLE:

import java.io.*;
import java.util.*;
public class Rectangle
{
public static void main(String []args)
{
Scanner a=new Scanner(System.in);
System.out.println("Enter the length of the rectangle");
float l=a.nextFloat();
System.out.println("Enter the breath of the rectangle");
float b=a.nextFloat();
float ans=l*b;
System.out.println("Area of the Rectangle is="+String.format("%.1f",ans)+"cm2");
}
}
