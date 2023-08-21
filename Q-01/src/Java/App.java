package Java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentTest studentTest = new StudentTest();
        
        studentTest.mainLoop(scanner);
        scanner.close();
    }
}