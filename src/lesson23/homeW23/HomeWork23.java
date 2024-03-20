package lesson23.homeW23;

public class HomeWork23 {
    public static void main(String[] args) {

        Product laptop = new Product("Lenovo T590", 1000);
        Product tv = new Product("Samsung 34`:", 800);

        Warehouse wareHouse = new  Warehouse();
        System.out.println(wareHouse);

        ToWarehouse toWarehouse = new ToWarehouse(1);
        toWarehouse.add(laptop, 50);
        toWarehouse.add(tv, 50);
        toWarehouse.toWarehouse(wareHouse);
        System.out.println(wareHouse);

        Order order = new Order(2);
        order.add(laptop, 10);
        order.add(tv, 5);

        FromWarehouse fromWarehouse = new FromWarehouse(3);
        fromWarehouse.add(order);
       fromWarehouse.fromWarehouse(wareHouse);
        System.out.println(wareHouse);
    }
}
