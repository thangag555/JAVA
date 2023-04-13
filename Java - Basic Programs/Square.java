//AREA OF THE SQUARE:

import java.io.*;
import java.util.*;
public class Square
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the side of the square");
float x=s.nextFloat();
float ans=x*x;
System.out.println("The area of the Square is="+String.format("%.1f",ans)+"cm2");
}
}
