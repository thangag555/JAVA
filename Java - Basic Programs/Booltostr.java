import java.io.*;
import java.util.Arrays;
public class Booltostr
{
public static void main(String args[])
{
Boolean bool1=false;
Boolean bool2=true;
String str1=new Boolean(bool1).toString();
String str2=new Boolean(bool2).toString();
System.out.println(str1);
System.out.println(str2);
}
}