package lesson17.hw17;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw17,Task1
 * @version 22-Feb-24
 * @author Halyna Poryvaieva
 */
public class Employee {
    private String initials;
    private String position;
    private String email;
    private int phone;
    private double salary;
    private int age;

    public Employee(String initials, String position, String email, int phone, double salary, int age) {
        this.initials = initials;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        if (initials != null) {
            this.initials = initials;
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position != null) {
            this.position = position;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null) {
            this.email = email;
        }
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age != 0 || age < 0) {
            this.age = age;
        }
    }
}
