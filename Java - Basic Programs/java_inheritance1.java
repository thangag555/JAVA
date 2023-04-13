import java.util.*;
class rect
{
Scanner my=new Scanner(System.in);
void display()
{
int l,b,area;
l=my.nextInt();
b=my.nextInt();
area=l*b;
System.out.println(area);
}
}

class square extends rect
{
Scanner my1=new Scanner(System.in);
void display1()
{
int l1,area1;
l1=my1.nextInt();
area1=l1*l1;
System.out.println(area1);
}
}


class circle extends square
{
Scanner my2=new Scanner(System.in);
void display2()
{
int l2,area2;
float pi=3.14f;
l2=my2.nextInt();
area2=pi*l2*l2;
System.out.println(area2);
}
}


class java_inheritance1
{
public static void main(String args[])
{
square s=new square();
s.display();
s.display1();
}
}