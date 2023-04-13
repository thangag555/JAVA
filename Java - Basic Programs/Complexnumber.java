import java.io.*;
import java.util.*;
public class Complexnumber
{
public static void main(String args[])
{
int i,add=0,add1=0,sub=0,sub1=0,mut=0,mut1=0;
Scanner s=new Scanner(System.in);
int num=s.nextInt();

int arr[]=new int[num];
int brr[]=new int[num];

for(i=0;i<num;i++)
{
arr[i]=s.nextInt();
}


for(i=0;i<num;i++)
{
brr[i]=s.nextInt();
}


for(i=0;i<num;i++)
{
add=arr[0]+brr[0];
add1=arr[1]+brr[1];
sub=arr[0]-brr[0];
sub1=arr[1]-brr[1];
mut=(arr[0]*brr[0])-(arr[1]*brr[1]);
mut1=(arr[0]*brr[1])+(arr[1]*brr[0]);
}
System.out.printf("add %d + %d i \n",add,add1);
System.out.printf("sub %d + %d i \n",sub,sub1);
System.out.printf("mul %d + %d i \n",mut,mut1);


}}