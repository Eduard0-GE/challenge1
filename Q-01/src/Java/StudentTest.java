package Java;

import java.util.*;

public class StudentTest {
    private List<Students> studentList = new ArrayList<>();
    private HashMap<Integer, ArrayList<String>> studentByAmountSolved = new HashMap<>();

    public List<Students> getStudentList() {
        return studentList;
    }

    public HashMap<Integer, ArrayList<String>> getStudentHashMap() {
        return studentByAmountSolved;
    }
    public int setStudentAmount(Scanner scanner) {
        boolean qtdValida = false;
        int qtdAlunos = 0;

        while (!qtdValida) {
            System.out.print("Enter the number of students of the class (min: 1, max: 100, exit:0): ");
            try {
                qtdAlunos = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type! Try again using an integer!");
                scanner.next();
                continue;
            }
            if (qtdAlunos > 0 && qtdAlunos <= 100) {
                System.out.println("Number of students: " + qtdAlunos);
                qtdValida = true;
            } else if (qtdAlunos == 0) {
                qtdValida = true;
            } else {
                System.out.println("Invalid student amount! Try again!");
                scanner.next();
            }
        }
        return qtdAlunos;
    }
}