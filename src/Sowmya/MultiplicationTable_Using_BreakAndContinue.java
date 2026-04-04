package Sowmya;
//for loop : Print a multiplication table from 1 to 10,
// but stop printing entirely when any result is divisible by 7 and
// greater than 30. Use a labeled break.

//Solution
// 5*6=35  which is dvisible by 7 and greater than 30 so come out of loop

public class MultiplicationTable_Using_BreakAndContinue {
    public static void main(String[] args) {
     outer:
        for (int i=1 ; i<=10;i++)
        {
            for (int j=1; j<=10; j++)
            {
                int result=(i*j);
                if(result%7==0 && result>30 )
                {
                    break outer;
                }
                System.out.println(result);
            }
        }
    }
}
/*
OutPut
1
2
3
4
5
6
7
8
9
10
2
4
6
8
10
12
14
16
18
20
3
6
9
12
15
18
21
24
27
30
4
8
12
16
20
24
28
32
36
40
5
10
15
20
25
30

 */


