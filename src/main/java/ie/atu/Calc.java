package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args){


    }
    public static void multiply()
    {
        System.out.println("please enter your first number:");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("please enter your second number");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.printf("the total is %f: ", total);

    }
}
