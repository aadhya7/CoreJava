package Sowmya;

/*
Questions: program to find the number of digits in a given number 14578

Solution:
1.Find the last number
2.u[date the count value
3update the number
%- gives Reminder
/-gives quotient
 */
public class NOofDigits {
    public static void main(String[] args) {
        int num=145786476; ////number
        int count=0; //count to count the number of digits
       while(num>0) //unitil number is greater than zero
       {
           int ln = num % 10; //finding the last digit
           if (ln > 0) {
               count++; //updating the num of digits
           }
           num = num / 10; //updating the remaining number to the original num

       }
        System.out.println(count);
    }
}
