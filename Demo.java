

public class Demo{

    public static void main(String[] args){

        Inventory inventory = new Inventory();
        
        Smartphone phone = new Smartphone("Android", 256, 64, "Samsung Galaxy S22", 500, 30, 15, 25, 12);
        inventory.addProduct(phone);

        Smartphone phone1 = new Smartphone("IOS", 256, 12, "Iphone 14 Plus", 800, 3, 30, 20 , 12);
        inventory.addProduct(phone1);

        System.out.println("Product Having ID 1 is " +inventory.searchByID(1));

        inventory.deleteProduct(phone);

        Laptop laptop = new Laptop(Processor.x86, 16, 1680, 1080, "Macbook Pro", 1000, 10, 50, 45, 12);
        inventory.addProduct(laptop);

        inventory.updateProduct(3, Processor.ARM, 32, 1680, 1080, "Macbook Pro Max", 1000, 10, 50, 50, 12);

        Product[] product = inventory.searchByCategory(ProductType.ELECTRONICS);
        System.out.println("Search By Category Results Are:");
        if(product[0]==null){
            System.out.println("No Products Found.");
        }
        else{
            for(int i=0;i<product.length;i++){
                if(product[i]==null) break;
                System.out.println(product[i]);
            }
        }

        Product[] product1 = inventory.getLowStockProducts();
        System.out.println("Low In Stock Products Are:");
        if(product1[0]==null){
            System.out.println("No Products Found.");
        }
        else{
            for(int i=0;i<product1.length;i++){
                if(product1[i]==null) break;
                System.out.println(product1[i]);
            }
        }

        inventory.setThisMonthSale(50);
        System.out.println("This Month's Sales Are:"+ inventory.getSaleByMonth(1));

        
    }

}