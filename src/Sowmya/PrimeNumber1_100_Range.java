package Sowmya;
//Write a program using for loop - Check for Prime Numbers in a Range 1 - 100
/*
Solution
if the given number is divided by 2
when the reminder is zero then it is not a Prime Number
when the reminder is not Zero then it is a

enter the range you want toprint inside the FOR Loop
 */
public class PrimeNumber1_100_Range {
    public static void main(String[] args) {

        for(int i=1;i<=100;i++)
        {
            if(i%2==1)
            {
                System.out.println("Given number is a Prime no = " + i);
            }
        }
    }
}
