package lesson29.hw28;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw28,Task1
 * @version 20-Mar-24
 * @author Halyna Poryvaieva
 */
    public class Bicycle {

        private String model;
        private int weight;

        public Bicycle(String model, int weight) {
            this.model = model;
            this.weight = weight;
        }

        public void start() {
            System.out.println("Let's go!");
        }

        public class HandleBar {

            public void right() {
                System.out.println("Steering wheel to the right!");
            }

            public void left() {

                System.out.println("Steering wheel to the left!");
            }
        }

        public class Seat {

            public void up() {

                System.out.println("The seat is raised higher!");
            }

            public void down() {

                System.out.println("The seat is lowered!");
            }
        }
    }

