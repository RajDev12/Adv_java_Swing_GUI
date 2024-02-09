package Stream_API;

import java.util.ArrayList;
import java.util.List;
class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class Object_filter {
    public static void main(String[] args) {
        List<Product> p=new ArrayList<>();

        p.add(new Product(101,"HP",4562.36));
        p.add(new Product(102,"Dell",1662.36));
        p.add(new Product(103,"MI",8562.36));
        p.add(new Product(104,"Asus",9562.36));
        p.add(new Product(101,"MAC",3562.36));

        p.stream()
                .filter(t->t.price > 5000)
                .forEach(e-> System.out.println(e.id+"\t" + e.name+"\t"+e.price));
    }
}
