package Sowmya.DoWhileLoopPrograms;
//for:write a program to print result of multiple of 7 till 100th number
/*
Multiples of 7 till 100 are
7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98.
 */

/*
Solution
Intilization i=7
Condition i<=100
Updation- difference between 2 number is 7 so i=i+7
 */
public class MultiplesOf_7_Table_Until_100 {
    public static void main(String[] args) {
        int i = 7;
        do {
            System.out.println(i);
            i = i + 7;
        } while (i <= 100);
    }
}


