package Sowmya;
//Program: Fizz-Buzz range from 1-50
//when the number is divisible by 2 --> print "Fizz"
//when the number is divisible by 5 --> print "Buzz"
//when the number is divisible by 2 & 5 --> "FizzBuzz"
//for remaining number print the "number"

//expected: 1 Fizz 3 Fizz Buzz Fizz 7 Fizz 9 FizzBuzz
//Actual: 1 1 Fizz 2 2 3 3 Fizz 4 4 buzz 5 5
/*
Solution
1.add an if condition when number is divided by 2 and the reminder should be zero
2.add one more if condition when number is divided by 5 and the reminder should be zero
3.addone more condition  when number is divided by 2 and 5 and the reminder should be zero
 */

public class FizzBuzzProgram {

    public static void main(String[] args)
    {

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0 && i% 5==0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }  else if (i % 2 == 0) {
                    System.out.println("Fizz ");
                } else  {
                    System.out.println(i);
                }
            //System.out.println(i);
            }
    }
}

/* output: 1 Fizz 2
Iteration1:
i = 1
if1 -> false
if2 -> false
if3 -> false
--------------------------------------------
Iteration2:
i = 2
if1 -> true
if2 -> false
if3 -> false

 */
