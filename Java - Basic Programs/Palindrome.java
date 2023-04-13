import java.io.*;
import java.util.*;
class Palindrome
{
public static void main(String args[])
{
System.out.println("enter the number:");
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int t=num;
int sum=0;
while(num>0){
int r=num%10;
sum=(sum*10)+r;
num=num/10;
}
if(t==sum)
{
System.out.println("palindrome number "); 
}   
else{    
System.out.println("not palindrome"); 
}  
}
}

