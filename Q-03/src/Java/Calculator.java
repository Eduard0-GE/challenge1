package Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public int operandAmt() {
        int operandAmount = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                operandAmount = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type!: Try again!");
                input.next();
            }
        }
        return operandAmount;
    }

    public String createOperation(int operandAmount) {
        Scanner input = new Scanner(System.in);
        String operation;

        operation = input.next();

        return operation;
    }
}
