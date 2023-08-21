package Java;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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

    public void operationResult(String operation, int operandAmount){
        List<String> operator = new ArrayList<>();
        List<Integer> operand = new ArrayList<>();
        int lastIndex = 0;

        for(int i = 0; i < operation.length(); i++){
            if(operation.charAt(i) == '-' || operation.charAt(i) == '+'){
                operator.add(String.valueOf( operation.charAt(i)));
                operand.add(Integer.parseInt(operation.substring(lastIndex, i)));
                lastIndex = i + 1;
            }
        }
        operand.add(Integer.parseInt(operation.substring(lastIndex, operation.length())));

        int result = operand.get(0);

        for(int i = 0; i < operandAmount - 1; i++){
            if(operator.get(i).equals("+")){
                result = result + operand.get(i + 1);
            }else{
                result = result - operand.get(i + 1);
            }
        }
        System.out.printf("%d\n",result);
    }

    public void mainLoop(){
        int operand = 999;
        while(operand != 0){
            System.out.println("Enter operand amount (0 to exit)");
            operand = operandAmt();
            if (operand > 0){
                String operation = createOperation(operand);
                operationResult(operation, operand);
            }else{
                System.out.println("Program finished!");
            }            
        }
    }
}
