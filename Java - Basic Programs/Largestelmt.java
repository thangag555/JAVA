import java.io.*;
import java.util.Arrays;
public class Largestelmt
{
public static void main(String args[])
{
int arr[]={12,56,76,89,100,343,21,234};
int small = arr[0];
int large = arr[0];
 
for(int i=1; i< arr.length; i++)
{
if(arr[i] > large)
large = arr[i];
else if (arr[i] < small)
small = arr[i];
 
}
System.out.println("Smallest Number is : " + small);
System.out.println("Largest Number is : " + large);
}
}
 

