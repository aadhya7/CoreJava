package Sowmya;
//Program: Fizz-Buzz range from 1-50
//when the number is divisible by 2 --> print "Fizz"
//when the number is divisible by 5 --> print "Buzz"
//when the number is divisible by 2 & 5 --> "FizzBuzz"
//for remaining number print the "number"
/*
Solution
1.add an if condition when number is divided by 2 and the reminder should be zero
2.add one more if condition when number is divided by 5 and the reminder should be zero
3.addone more condition  when number is divided by 2 and 5 and the reminder should be zero
 */

public class FizzBuzzProgram {

    public static void main(String[] args) {

        int num=10;

        if(num%2==0)
        {
            System.out.println("Fizz - number is divisible by 2  " + num);
        }
         if(num%5==0)
        {
            System.out.println("Buzz - number is divisible by 5 "+num);
        }
         if(num%2==0 && num%5==0)
        {
            System.out.println("FizzBuzz - number is divisible by 2 & 5 " +num);
        }
    }
}
