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
}