import java.io.*;
public class Sumsqrdiff{
public static void main(String[] args) {
int n = 100;
int sumOfSquares = n * (n + 1) * (2 * n + 1) / 6;
int squareOfSum = (n * (n + 1) / 2) * (n * (n + 1) / 2);
int difference = sumOfSquares - squareOfSum;
System.out.println("The difference is: " + difference);
}
}