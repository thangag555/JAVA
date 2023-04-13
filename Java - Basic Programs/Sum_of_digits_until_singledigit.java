import java.util.*;
class Sum_of_digits_until_singledigit
{
public static void main(String args[])
{
int n,res=0,r;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the integer number:");
n=sc.nextInt();
sum(n);
}
static void sum(int n)
{
int res=0,a=0,r;
while(n>0)
{
r=n%10;
n=n/10;
res=res+r;
a=res;
}
if(a<10)
{
System.out.println("The sum of digits until single digit of the number = "+res);
}
else
{
sum(a);
} 
} 
}