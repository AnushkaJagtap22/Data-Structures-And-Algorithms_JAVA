import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Anushka");
        students.put(102, "Riya");
        students.put(103, "Aarush");

        System.out.println(students);

        System.out.println("Student 102: " + students.get(102));
    }
}