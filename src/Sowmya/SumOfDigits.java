package Sowmya;
//Write a program using for loop - Sum of Digits in a Number 153 . Output=9
/*
Solution

Find the last digit = num/10
store in a variable



 */

public class SumOfDigits {

    public static void main(String[] args) {
        int num=153;
        int count =0;

        while(num>0) //unitil number is greater than zero
        {
            int ln = num % 10; //finding the last digit
            if (ln > 0) {
                count= count+ln; //updating the num of digits
            }
            num = num / 10; //updating the remaining number to the original num

        }
        System.out.println(count);

    }
}
