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

    public void createStudents(Scanner scanner, int studentAmount) {

        int counter = 0;

        while (counter < studentAmount) {
            String name = "";
            int qtdSolved = 0;
            System.out.print("Enter the student's name and amount of questions solved: ");
            try {
                name = scanner.next();
                qtdSolved = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type! Try again!");
                scanner.next();
                continue;
            }
            if (name.length() > 20) {
                System.out.print("Name excedeed the maximum lenght");
                continue;
            } else if (qtdSolved < 0 || qtdSolved > 10) {
                System.out.println("Solved questions out of range(min: 0 - max: 10)");
                continue;
            }
            studentList.add(new Students(name, qtdSolved));
            counter++;
        }
    }

    public void sortStudentsByQtdSolved(List<Students> studentList) {
        ArrayList<String> names = new ArrayList<>();
        for (Students student : studentList) {
            if (studentByAmountSolved.containsKey(student.getQtdSolved())) {
                names = studentByAmountSolved.get(student.getQtdSolved());
                names.add(student.getName());
            } else {
                studentByAmountSolved.put(student.getQtdSolved(), new ArrayList<>());
                names = studentByAmountSolved.get(student.getQtdSolved());
                names.add(student.getName());
            }
        }
    }

    public String unluckyStudent() {
        ArrayList<String> list = new ArrayList<>();
        String unluckyStudent = "";

        for (int i = 0; i < 11; i++) {
            if (studentByAmountSolved.containsKey(i)) {
                list = studentByAmountSolved.get(i);
                if (list.isEmpty()) {
                } else {
                    list = studentByAmountSolved.get(i);
                    Collections.sort(list, Collections.reverseOrder());
                    unluckyStudent = list.get(0);
                    break;
                }
            } else {
                continue;
            }
        }
        return unluckyStudent;
    }

}