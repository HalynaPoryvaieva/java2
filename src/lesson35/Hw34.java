package lesson35;

import lesson17.hw17.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hw34 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("name3", "position1", "email1", 23456, 12500, 35),
                new Employee("name2", "position1", "email1", 67900, 12500, 36),
                new Employee("name1", "position1", "email1", 890653, 12500, 25)

        ));
        Comparator<Employee> nameComparator = (e1, e2) -> e1.getInitials().compareTo(e2.getInitials());
        Collections.sort(employees, nameComparator);
        System.out.println("by name:");
        employees.forEach(System.out::println);

        Comparator<Employee> ageComparator = (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge());
        Collections.sort(employees, ageComparator);
        System.out.println("by age:");
        employees.forEach(System.out::println);
    }
}
