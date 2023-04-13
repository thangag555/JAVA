//AREA OF CIRCLE:

import java.io.*;
import java.util.*;
public class Circle
{
public static void main(String...args)
{
Scanner a=new Scanner(System.in);
System.out.println("Enter the radius of the circle");
double r=a.nextDouble();
double ans=3.14*r*r;
System.out.println("Area of the circle is="+String.format("%.1f",ans)+"cm2");
}
}
