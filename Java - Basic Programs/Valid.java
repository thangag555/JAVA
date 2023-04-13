import java.io.*;
import java.util.*;
class Valid
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String inp=s.nextLine();
String saminp="12X345-67";
String val1="valid";
String val2="invalid";
if(inp==saminp)
{
System.out.println(val1);
}
else{
System.out.println(val2);
}
}
}
