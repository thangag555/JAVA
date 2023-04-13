import java.io.*;
import java.util.*;
public class Transposematrix
{
public static void main(String args[])
{
int a[][]={{10,20,30},{40,50,60},{70,80,90}};
int trans[][]=new int[3][3];
for(int i=0;i<=3;i++)
{
for (int j=0;j<=3;i++)
{
trans[i][j]=a[j][i];
}
}
for(int i=0;i<=3;i++)
{
for(int j=0;j<=3;j++)
{
System.out.println(a[i][j]);
}
}
for(int i=0;i<=3;i++)
{
for(int j=0;j<=3;j++)
{
System.out.println(trans[i][j]);
}
}
}
}