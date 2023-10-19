public class Furniture extends Product {
    private String material;
    private int length;
    private int width;

    public Furniture(String n,int p,int q,int t,String m,int w, int l){
        super(n,p,q,t,ProductType.FURNITURE);
        this.material = m;
        this.length = l;
        this.width = w;
    }

    public void setMaterial(String m){
       this.material = m;
    }

    public void setLength(int l){
        this.length = l;
     }

     public void setWidth(int w){
        this.width = w;
     }

    public String getMaterial(){
        return material;
    }

    public int getLength(){
       return length;
    }

    public int getWidth(){
        return width;
     }

     @Override
     public String toString(){
      return String.format(super.toString() + "Material: %s, Width: %d m, Length: %d m",material,width,length);
  }

}
