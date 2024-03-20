package lesson23.homeW23;

public class FromWarehouse extends BaseDocument{

    public FromWarehouse(int id) {
        super(id);
    }

    public void add(Order order){
        products=order.getProducts();
    }

    public  void fromWarehouse(Warehouse wareHouse){
        wareHouse.deleteAll(products);
   }
}
