package lesson23.Hw22;

import lesson23.Hw22.Cat;

public class Tiger extends Cat {

    public Tiger(int age) {
        super(age);
    }

    @Override
    public String voice() {
        return super.voice();
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
