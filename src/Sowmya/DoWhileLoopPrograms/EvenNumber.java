package Sowmya.DoWhileLoopPrograms;
//do while: Write a program to print the even number from 1 to 30
/*
Evennumbers from 1 to 30
from 1 to30 Even numbers are
( 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, and 30)
Difference is 2  between each number
 */

/*
Solution:
1.intilization i=2
2.updation i+2
3.Condition i<=30
 */

public class EvenNumber {
    public static void main(String[] args) {

        int i = 2; //initialzation
        while (i<=30) //condition
        {
            System.out.println(i);
            i = i + 2; //updation
        }
    }
}
