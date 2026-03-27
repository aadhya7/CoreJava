package Sowmya.WhileLoopPrograms;
//for: Write a program to print the odd number from 1 to 20
/*
from 1 to 20 ODD numbers are
        ( 1, 3, 5, 7, 9, 11, 13, 15, 17, and 19)
Difference is 2  between each number
 */

/*
Solution:
1.intilization i=1
2.updation i+2
3.Condition i<=20
 */
public class OddNumber {

    public static void main(String[] args) {

        int i=1;
        while(i<=20)
        {
            System.out.println(i);
            i=i+2;
        }
    }
}
