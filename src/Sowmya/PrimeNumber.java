package Sowmya;
//Write a program to check the number is prime or not.
/*
Solution
if the given number is divided by 2
when the reminder is zero then it is not a Prime Number
when the reminder is not Zero then it is a PrimeNumber
 */

public class PrimeNumber {
    public static void main(String[] args) {
    int i=15;
        if(i%2==1)
        {
            System.out.println("Prime no" + i);
        }
        else
        {
            System.out.println("not Prime" + i);
        }
    }
}
