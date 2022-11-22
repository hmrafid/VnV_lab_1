package shopTestWithoutPayment;

public class Products {

    static int productCount = 1;
    public int id;
    public int price;
    public String name;
    public String group;


    public Products(String name, String group, int price) {
        id = productCount;
        this.name = name;
        this.group = group;
        this.price = price;
        ++productCount;
    }

   public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
