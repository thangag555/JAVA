import java.util.*;
public class Diagonalpattern
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int inp=s.nextInt();
int i;
for(i=0;i<=inp;i++)
{
for(int j=1;j<=inp-i;j++)
{
System.out.print(j);
}
System.out.println(" ");
}
}
}
