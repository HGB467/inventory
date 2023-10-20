public class Electronics extends Product {
    private int powerConsumption;
    private int warrenty;

    public Electronics(String n,int p,int q,int t,int p1,int w){
        super(n,p,q,t,ProductType.ELECTRONICS);
        this.powerConsumption = p1;
        this.warrenty = w;
    }

    public void setPowerConsumption(int p){
       this.powerConsumption = p;
    }

    public int getPowerConsumed(){
        return powerConsumption;
    }

    public void setWarrenty(int w){
       this.warrenty = w;
    }

    public int getWarrenty(){
        return warrenty;
    }

    @Override
    public String toString(){
        return String.format(super.toString() + "Power Consumption: %d W, Warrenty: %d M, ", powerConsumption,warrenty);
    }

}
