import java.util.*;
class Repeated_element_array
{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
int x=sc.nextInt();
int a[]=new int[x];
System.out.println("Enter the elements");
for(i=0;i<a.length;i++)
{
   a[i]=sc.nextInt();
}
Arrays.sort(a);
for(i=0;i<a.length;i++)
{
int count=1;
for(j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
count++;
}
else{ 
break;
}
}
i=j-1;
if(count>=1)
{			
System.out.println(a[i]+ "=" +count);				
}
}
}