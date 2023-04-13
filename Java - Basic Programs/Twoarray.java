import java.io.*;
import java.util.Arrays;
public class Twoarray
{
public static void main(String args[])
{
int a1[]={1,2,3,4,5};
int a2[]={1,2,3,4,5};
int a3[]={1,2,3,4};
System.out.println("array1=array2 "+Arrays.equals(a1,a2));
System.out.println("array2=array3 "+Arrays.equals(a2,a3));
}
}

