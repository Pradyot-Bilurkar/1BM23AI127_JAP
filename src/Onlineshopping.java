import java.util.Vector;

class Product {
    String name;
    int price;
    String category;

    public Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    @Override
    public String toString() {
        return "Product Name: " + name + ", Price: " + price + ", Category: " + category;
    }

}

class Onlineshopping {
    Vector<Product> Os = new Vector<>();

    public void additem(String name, int price, String category) {
        Product product = new Product(name, price, category);
        Os.add(product);
        System.out.println("Item added");
    }
    public void removeitem(String name)
    {
        Os.removeIf(product -> product.name == name);
    }
    public void display() {
        for (Product product : Os) {
            System.out.println(product);
        }
    }

    public static void main(String args[]) {
        Onlineshopping Os = new Onlineshopping();
        Os.additem("Pencil", 5, "Stationary");
        Os.additem("Headphones", 5000, "Electronics");
        Os.display();
        Os.removeitem("Pencil");
        System.out.println("\nAfter removing Pencil : \n");
        Os.display();
    }
}
