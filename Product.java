public class Product {
    public static int idsTaken=0;
    private int id;
    private String name;
    private int price;
    private int quantity;
    private int tax;
    private ProductType productType;

    public Product(String n,int p, int q, int t,ProductType p1){
       this.id = ++idsTaken;
       this.name = n;
       this.price = p;
       this.quantity = q;
       this.tax = t;
       this.productType = p1;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setPrice(int p) {
        this.price = p;
    }

    public int getPrice(){
        return price;
    }

    public void setQuantity(int q) {
        this.quantity = q;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setTax(int t) {
        this.tax = t;
    }

    public int getTax(){
        return tax;
    }

    public void setId(int i1){
        this.id = i1;
    }

    public int getId(){
        return id;
    }

    public void setProductType(ProductType p1){
        this.productType = p1;
    }

    public ProductType getProductType(){
        return productType;
    }

    @Override
    public String toString(){
        return String.format("ID: %d, Name: %s, Price: %d, Quantity: %d, Tax: %d, Product Type: %s, ", id,name,price,quantity,tax,productType);
    }


}
