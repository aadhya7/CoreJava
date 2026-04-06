package Sowmya;
//Java program to swap two numbers without using third variable
/*
Store the sum of a and b in a (a = a + b).
Get the original value of a, that is (sum - original value of b)and store it in b (b = a - b).
Get the original value of b, that is (sum - original value of a)and store it in a (a = a - b).
 */
public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a=1;
        int b=2;
        System.out.println("a="+a + "b=" +b) ;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a  + "b=" +b);
    }
}
