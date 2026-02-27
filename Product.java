class Product {

    private String productName;
    private double price;

    public void setDetails(String name, double price) {
        this.productName = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double calculateDiscount() {
        return 0;
    }

    public static void main(String[] args) {

        Product p1 = new Electronics();
        Product p2 = new Clothing();

        p1.setDetails("Laptop", 50000);
        p2.setDetails("Shirt", 2000);

        System.out.println("Electronics Discounted Price: " + p1.calculateDiscount());
        System.out.println("Clothing Discounted Price: " + p2.calculateDiscount());
    }
}

class Electronics extends Product {

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.9;   // 10% discount
    }
}

class Clothing extends Product {

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.8;   // 20% discount
    }
}