package shopTest;

public class Products {

    static int prodCount = 1;
    public int id;
    public int price;
    public String name;
    public String group;


    public Products(String name, String group, int price) {
        this.id = prodCount;
        this.name = name;
        this.group = group;
        this.price = price;
        ++prodCount;
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
