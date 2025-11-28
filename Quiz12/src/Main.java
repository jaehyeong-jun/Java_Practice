class Product{
    int stock;
    String name;
    Product(){
        this.stock = 0;
        this.name = null;
    }

    Product(String name)
    {
        this.stock = 0;
        this.name = name;
    }

    Product(int stock, String name)
    {
        this.stock = stock;
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

public class Main {
    public static void main(String[] args) {

        int num;

        Product potato = new Product("감자");
        potato.setStock(50);

        Product melon = new Product(30, "melon");

        num = potato.getStock();
        System.out.println("현재 감자의 재고수 : " + num);

        num = melon.getStock();
        System.out.println("현재 멜론의 재고수 : " + num);
    }
}