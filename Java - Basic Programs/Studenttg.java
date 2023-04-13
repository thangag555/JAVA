class Studenttg
{
    int id;
    String name;
    Main (int i, String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+""+name);
    }
      public static void main(String args[])
    {
        Student s1=new Student(111, "  ram");
        Student s2=new Student(101, "  ravi");
        s1.display();
        s2.display();
    }
}
