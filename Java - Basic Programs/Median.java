import java.util.*;
class Median
{
public static void main(String args[])
{
int n,i,c,b;

Scanner sc=new Scanner(System.in);
System.out.println("Enter Array size");

n=sc.nextInt();

int a[]=new int[n];


System.out.println("Enter Array elements ");


for(i=0;i<n;i++)
{
  
a[i]=sc.nextInt();  

}

b=n/2;



System.out.println("Given Array");

for(i=0;i<n;i++)
{
   

System.out.print(a[i]+" ");

}

System.out.println(" ");

if(n%2!=0)
{

c=Math.round(b);

System.out.printf("the median is %d \n",a[c]);

}

else
{

float d=(a[b]+a[b-1]);
System.out.printf("the median is %.2f \n",d/2);

}







}}