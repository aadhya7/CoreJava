package Sowmya;
//Switch : Create a calculator program that asks the user to enter two numbers
// and an operator (+, -, *, /). Use a switch
// statement to perform the operation and print the result. Handle division by zero with an appropriate message.

import java.util.Scanner;

/*
enter 2 number
num1 and num2
Case Addition -> num1 + num2
Case Subtraction -> num1 - num2
Case Multiplication -> num1 * num2
case Division -> num1 / num2

 */
public class SwitchProgram {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter two number:");
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();

String operation ="xyz";
        String result = String.valueOf(switch (operation)
        {
            case "Addition" -> num1+num2;
            case "Subtraction" -> num1-num2;
            case "Multiplication" -> num1*num2;
            case "Division" -> num1/num2;

            default ->"invalid operation";
        });
        System.out.println(result);
        System.out.println("Divide by zero");

    }
}
