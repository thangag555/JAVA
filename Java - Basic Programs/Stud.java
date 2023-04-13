import java.io.*;
import java.util.*;
public class Stud
{
int rollno=721;
String name="ganesh";
String studper="90%";

void markreport(int rollno,String name)
{
System.out.println("student name="+name);
System.out.println("student rollno="+rollno);
System.out.println("student percentage="+studper);
}
}

public class Staff
{
int staffid=820;
String staffname="santhosh";
String subname="physics";

void subjecthandled(int staffid,String staffname)
{
System.out.println("subject="+subname);
}
}

public static void main(String args[])
{
Stud s=new Stud();
Staff n=new Staff();
System.out.println(s.markreport(721,"ganesh"));
}
}