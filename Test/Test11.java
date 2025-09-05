class Product
{
    private String name;
    private int id;
    private String date;

    public Product() {
    }
    public Product(String name, int id, String date) {
        this.name = name;
        this.id = id;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

public class ProductTest
{
    public static void main(String[] args)
    {
        Product p1 = new Product("신라면", 1, "2025-09-05");
        System.out.println("상품ID : " + p1.getId());
        System.out.println("상품이름 : " + p1.getName());
        System.out.println("생산날자 : " + p1.getDate());

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("진라면");
        p2.setDate("2025-09-05");
        System.out.println("\n상품ID : " + p2.getId());
        System.out.println("상품이름 : " + p2.getName());
        System.out.println("생산날자 : " + p2.getDate());
    }
}