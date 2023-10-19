public class Inventory {

    Product[] products;
    int currentIndex = 0;

    public Inventory(){
        products = new Product[100];
    }

    public void addProduct(Product p1){
         products[currentIndex++] = p1;
    }

    public void deleteProduct(Product p1){
        for(int i=0;i<currentIndex;i++){
            if(products[i].getId()==p1.getId()){
                for(int j=i;j<currentIndex;j++){
                    products[j] = products[j+1];
                    products[j+1] = null;
                    currentIndex--;
                }
             break;
            }
         }
    }

    public Product searchByID(int id){
      for(int i=0;i<currentIndex;i++){
         if(products[i].getId()==id){
          return products[i];
         }
      }
      return null;
    }


    public Product searchByName(String name){
        for(int i=0;i<currentIndex;i++){
           if(products[i].getName()==name){
            return products[i];
           }
        }
        return null;
      }

     public Product[] searchByCategory(ProductType p){
        Product[] tempProducts = new Product[100];
        int tempIndex = 0;
        for(int i=0;i<currentIndex;i++){
            if(products[i].getProductType()==p){
              products[tempIndex++] = products[i];
            }
         }
         return tempProducts;
     }

     public void updateProduct(int id,String o1, int s1, int c1,String n,int p,int q,int t,int p1,int w){
        for(int i=0;i<currentIndex;i++){
            if(products[i].getId()==id){
                Smartphone product = (Smartphone) products[i];
                product.setId(id);
                product.setName(n);
                product.setOperatingSystem(o1);
                product.setPowerConsumption(p1);
                product.setWarrenty(w);
                product.setPrice(p);
                product.setQuantity(q);
                product.setStorageCapacity(s1);
                product.setTax(t);
               break;
            }
         }
     }

     public void updateProduct(int id,Processor p2, int r, int w1,int h1,String n,int p,int q,int t,int p1,int w){
        for(int i=0;i<currentIndex;i++){
            if(products[i].getId()==id){
                Laptop product = (Laptop) products[i];
                product.setId(id);
                product.setName(n);
                product.setWarrenty(w);
                product.setPrice(p);
                product.setQuantity(q);
                product.setTax(t);
                product.setProcessor(p2);
                product.setRamSize(r);
                product.setWidth(w1);
                product.setHeight(h1);
               break;
            }
         }
     }

     public void updateProduct(int id,int v, boolean b, int r, int w1,int h1,String n,int p,int q,int t,int p1,int w){
        for(int i=0;i<currentIndex;i++){
            if(products[i].getId()==id){
                AudioDevices product = (AudioDevices) products[i];
                product.setId(id);
                product.setName(n);
                product.setWarrenty(w);
                product.setPrice(p);
                product.setQuantity(q);
                product.setTax(t);
                product.setBluetooth(b);
                product.setVolume(v);
               break;
            }
         }
     }

     public void updateProduct(int id, int l1,int h1, String n, int p, int q, int t, String m, int w, int l){
        for(int i=0;i<currentIndex;i++){
            if(products[i].getId()==id){
                Seating product = (Seating) products[i];
                product.setId(id);
                product.setName(n);
                product.setPrice(p);
                product.setQuantity(q);
                product.setTax(t);
                product.setLength(l);
                product.setWidth(w);
                product.setLoadCapacity(l1);
                product.setMaterial(m);
               break;
            }
         }
     }

     public void updateProduct(int id,String s1,int h1, String n, int p, int q, int t, String m, int w, int l){
        for(int i=0;i<currentIndex;i++){
            if(products[i].getId()==id){
                Table product = (Table) products[i];
                product.setId(id);
                product.setName(n);
                product.setPrice(p);
                product.setQuantity(q);
                product.setTax(t);
                product.setLength(l);
                product.setWidth(w);
                product.setMaterial(m);
                product.setShape(s1);
               break;
            }
         }
     }


     public void updateProduct(int id,String n,int p,int q,int t,Date d1,int protein,int fat, int carb){
        for(int i=0;i<currentIndex;i++){
            if(products[i].getId()==id){
                Grocery product = (Grocery) products[i];
                product.setId(id);
                product.setName(n);
                product.setPrice(p);
                product.setQuantity(q);
                product.setTax(t);
                product.setExpirationDate(d1);
                product.setFatAmount(fat);
                product.setProteinAmount(protein);
                product.setCarbsAmount(carb);
               break;
            }
         }
     }


    
}
