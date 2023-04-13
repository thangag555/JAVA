import java.io.*;
class Student11{
	int id;
	String name;
	Student11 (int i,String n){
		id=1;
		name=n;
	}
	void display()
	{
	System.out.println(id+" "+name);
}
public static void main(String args[]){
	Student11 s1=new Student11(1,"Ameon");
	Student11 s2=new Student11(2,"Arya");
	s1.display();
	s2.display();
}
}