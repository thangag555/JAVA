import java.util.*;

abstract class bank
{

abstract void getbalance();


}


class bankA extends bank
{

void getbalance()
{

System.out.println("Money deposited in bankA is $1000");

}


}

class bankB extends bank
{

void getbalance()
{

System.out.println("Money deposited in bankB is $1500");

}


}

class bankC extends bank
{

void getbalance()
{

System.out.println("Money deposited in bankC is $2000");

}


}

class Moneydeposited
{

public static void main(String args[])
{


bank A=new bankA();
A.getbalance();

bank B=new bankB();
B.getbalance();


bank C=new bankC();
C.getbalance();






}}