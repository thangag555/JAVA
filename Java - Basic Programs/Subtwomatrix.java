import java.io.*;
import java.util.*;
public class Subtwomatrix
{
public static void main(String args[])
{
int a[][]={{10,20,30},{40,50,60}};
int b[][]={{70,80,90},{10,20,30}};
int c[][]=new int[2][2];
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
c[][]=a[i][j]-b[i][j];
}
System.out.print(c[][]);
}
}
}
