public class Smartphone extends Electronics{

    private String operatingSystem;
    private int storageCapacity;
    private int cameraResolution;

    public Smartphone(String o1, int s1, int c1,String n,int p,int q,int t,int p1,int w){
        super(n,p,q,t,p1,w);
        this.operatingSystem = o1;
        this.storageCapacity = s1;
        this.cameraResolution = c1;
    }

    public void setOperatingSystem(String o1){
       this.operatingSystem = o1;
    }

    public void setStorageCapacity(int s1){
        this.storageCapacity = s1;
    }

    public void getCameraResolution(int c1){
        this.cameraResolution = c1;
    }

    public String getOperatingSystem(){
        return operatingSystem;
    }

    public int getStorageCapacity(){
        return storageCapacity;
    }

    public int getCameraResolution(){
        return cameraResolution;
    }

    @Override
    public String toString(){
        return String.format(super.toString() + "Operating System: %s, Storage Capacity: %d GB, Camera Resolution: %d MP", operatingSystem,storageCapacity,cameraResolution);
    }


}