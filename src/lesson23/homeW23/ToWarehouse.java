package lesson23.homeW23;

import java.util.ArrayList;
import java.util.List;

public class ToWarehouse extends BaseDocument{

    public ToWarehouse(int id) {
        super(id);
    }

    public void add(Product product,int count){
        products.add(new ProductAndCount(product,count));
    }

    public void toWarehouse(Warehouse wareHouse){
        wareHouse.addAll(products);
    }
}
