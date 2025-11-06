import java.util.*;

class Product1 {
    String name; double price; int rating;
    Product1(String n, double p, int r) { name=n; price=p; rating=r; }
    public String toString(){ return name+" "+price+" "+rating; }
}

 class ECommerceSort {
    public static void main(String[] args) {
        List<Product1> list = Arrays.asList(
            new Product1("Phone", 800, 5),
            new Product1("Laptop", 1200, 4),
            new Product1("Watch", 200, 3)
        );

        list.sort((a,b)->Double.compare(a.price,b.price));
        System.out.println("By Price: " + list);

    
        list.sort((a,b)->b.rating - a.rating);
        System.out.println("By Rating: " + list);
    }
}
