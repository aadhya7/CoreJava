package Sowmya;
//Java program to find Palindrome number
/*
 an integer that remains the same when its digits are reversed, reading the same forwards and backwards.
 eg:-121 , 1331 ,
 */

public class Palindrome {
    public static void main(String[] args) {



        int num = 121;
        int n = num;

        int reverseNum= 0;
        //

        while (n>0)
        {
            int lastDigit = n%10;
            reverseNum = reverseNum*10 + lastDigit;
            n = n/10;
        }

        System.out.println(reverseNum);
        if(num==reverseNum) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not_Palindrome");
        }


    }
}
