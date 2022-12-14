package shopTest;

import java.util.ArrayList;

public class Admin{

    static int adminCount = 1;
    public ArrayList<Products> productItems = new ArrayList<Products>();
    private int id;
    private String name;

    public ArrayList<Products> ViewProducts(){
        for (Products product : productItems) {
            System.out.println(product.name);
        }
        return productItems;
    }

    public Admin(String name) {
        id = adminCount;
        name = name;
        ++adminCount;
    }

    public void AddProducts(String name, String group, int price){
        Products products = new Products(name, group, price);
        productItems.add(products);
    }

    public void DeleteProducts(int id){
        productItems.remove(id);
    }

    public void ModifyProducts(int id, String name, String group, int price){
        Products p = productItems.get(id);
        p.setName(name);
        p.setGroup(group);
        p.setPrice(price);
    }



}
