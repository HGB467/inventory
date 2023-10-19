public class Seating extends Furniture {

    private int loadCapacity;

    public Seating(int l1,int h1, String n, int p, int q, int t, String m, int w, int l) {
        super(n, p, q, t, m, w, l);
        this.loadCapacity = l1;
    }


    public void setLoadCapacity(int l1) {
        this.loadCapacity = l1;
    }


    public int getLoadCapacity(){
        return loadCapacity;
    }


    @Override
    public String toString(){
        return String.format(super.toString() + "Load Capacity: %d KG",loadCapacity);
    }

}
