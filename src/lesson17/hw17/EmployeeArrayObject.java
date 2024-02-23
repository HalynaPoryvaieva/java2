package lesson17.hw17;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw17,Task1
 * @version 22-Feb-24
 * @author Halyna Poryvaieva
 */
public class EmployeeArrayObject {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Dr.Set", "doctor", "doctor@gmail.com", 313_254_421, 5000, 45),
                new Employee("Stef Oft", "entrepreneur", "oft@gmail.com", 123_234_345, 4000, 39),
                new Employee("Tom Fox", "driver", "driver@gmail.com", 656_111_656, 1.500, 25),
                new Employee("Tedi Max", "mechanic", "mechanic@gmail.com", 800_765_444, 3.800, 44),
                new Employee("Kara Mag", "surgeon", "magsurgeon@gmail.com", 122_545_112, 7.100, 50)
        };
        for (Employee employee : employees) {
            if ( employee.getAge() > 40 ) {
                employee.printInfo();
            }
        }
    }
}
