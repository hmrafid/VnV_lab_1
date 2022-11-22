package shopTest;

public class Main {
    public static void main(String[] args) {


        Products product1 = new Products("Iphone 14", "Mobile", 800);
        Products product2 = new Products("Pixel 7", "Mobile", 650);
        Products product3 = new Products("Samsung Galaxy S22", "Mobile", 700);

        Admin admin1 = new Admin("Admin1");

        admin1.AddProducts(product1.name, product1.group, product1.price);
        admin1.AddProducts(product2.name, product2.group, product2.price);
        admin1.AddProducts(product3.name, product3.group, product3.price);


        System.out.println(".............Admin1 Products.........");
        admin1.ViewProducts();
        Customer customer1 = new Customer("Customer1");

//        Customer adds products in cart

        customer1.AddToCart(product1);
        customer1.AddToCart(product2);

        System.out.println(".........Cart Products..........");
        customer1.ViewCartProducts();

        System.out.println();
        System.out.println("Total Price: " + customer1.cart.SumTotalPrice());


        System.out.println(".........Payment..........");

        customer1.payment.MakePayment(customer1.cart.SumTotalPrice());


        System.out.println(".........Guest view Products..........");

        Guest guest1 = new Guest();
        guest1.ViewProducts(admin1);
        guest1.GetRegistered("Guest1");


    }
}