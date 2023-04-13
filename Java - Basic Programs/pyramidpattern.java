import java.util.*;
public class Pyramidpattern
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int inp=s.nextInt();
int i,k=1;
for(i=1;i<=inp;i++)
{
for(int j=1;j<i+1;j++)
{
System.out.print(k++ +" ");
}
System.out.println(" ");
}
}
}