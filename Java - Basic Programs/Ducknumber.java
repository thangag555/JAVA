import java.io.*;
import java.util.*;
public class Ducknumber{
public static void main(String[] args) {
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the num");
    int num=sc.nextInt();
    int count=0,r;
    while(num!=0)
    {
        r=num%10;
        if(r==0)
        {
        count++;
        }
        num=num/10;
    }
    if(count>0)
    {
    System.out.println("it is a duck number");
}else{
    System.out.println("it is not a duck number");
}
}

}