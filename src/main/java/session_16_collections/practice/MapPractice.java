package session_16_collections.practice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Integer> students = initializeMap();
        int result = retriveValue(students,"Alice");
        System.out.println("Alice's age is" + result);

        updateMop(students, "Bob",20);
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println("Student's name is: " + entry.getKey());
            System.out.println("Student's age is: " + entry.getValue());
        }
    }

    public static void updateMop(Map<String, Integer> map, String key, int value) {
        map.put(key, value);
    }

    public static int retriveValue(Map<String, Integer> map, String key) {
        return map.get(key);
    }

    public static Map<String, Integer> initializeMap() {
        Map<String, Integer> students = new HashMap<>();
        students.put("Alice", 21);
        students.put("Charlie", 22);
        students.put("John", 23);

        return students;
    }
}
