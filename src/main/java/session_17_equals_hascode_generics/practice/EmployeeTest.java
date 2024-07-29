package session_17_equals_hascode_generics.practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeTest {

    public static void main(String[] args) {
        Emplayee emp1 = new Emplayee();
        emp1.setId(1L);
        emp1.setFirstName("John");
        emp1.setLastName("Doe");

        Emplayee emp2 = new Emplayee();
        emp2.setId(1L);
        emp2.setFirstName("John");
        emp2.setLastName("Doe");

        System.out.println("emp1 equals emp2: " + emp1.equals(emp2));

        Set<Emplayee> emplayeeSet = new HashSet<>();
        emplayeeSet.add(emp1);
        emplayeeSet.add(emp2);

        System.out.println("employeeSet size " + emplayeeSet.size());

        System.out.println("emp1: " + emp1);



    }
}
