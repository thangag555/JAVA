import java.io.*;
class Primefactor
{
public static void main(String[] args) {
long num = 600851475143L;
long i = 2;
for ( i=2; i <= num; i++) 
{           
while (num % i == 0) {
num=num/i;
}
}
System.out.println(i-1);
}
}