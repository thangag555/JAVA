import java.util.*;
public class largsmal_word
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a sentence: ");
String str1=sc.nextLine();
String[] words=str1.split(" ");
String small=words[0];
String larg=words[0];
for (int i = 1; i < words.length; i++) 
{
if (words[i].length()< small.length()) 
{
small=words[i];
}
if (words[i].length()>larg.length()) 
{
larg=words[i];
}
}
System.out.println("Small word: "+small);
System.out.println("Larg word: "+larg);
}
}