import java.io.*;
import java.util.*;
public class Arrinp{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int size=s.nextInt();
int a[]=new int[size];
for(int i=0;i<=a.length;i++){
a[i]=nextInt();
}

}
}



import java.util.Arrays;
import java.util.Scanner;

public class PopulatingAnArray {
   public static void main(String args[]) {
      System.out.println("Enter the required size of the array :: ");
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int myArray[] = new int [size];
      System.out.println("Enter the elements of the array one by one ");
      for(int i=0; i<size; i++) {
         myArray[i] = s.nextInt();
      }
      System.out.println("Contents of the array are: "+Arrays.toString(myArray));
   }
}