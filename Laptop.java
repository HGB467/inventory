public class Laptop extends Electronics{

    private Processor processor;
    private int ramSize;
    private int width;
    private int height;

    public Laptop(Processor p2, int r, int w1,int h1,String n,int p,int q,int t,int p1,int w){
        super(n,p,q,t,p1,w);
        this.processor = p2;
        this.ramSize = r;
        this.width = w1;
        this.height = h1;
    }

    public void setProcessor(Processor p){
       this.processor = p;
    }

    public void setRamSize(int r){
        this.ramSize = r;
    }

    public void setWidth(int w){
        this.width = w;
    }

    public void setHeight(int h){
        this.height= h;
    }

    public Processor getProcessor(){
        return processor;
    }

    public int getRamSize(){
        return ramSize;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    @Override
    public String toString(){
        return String.format(super.toString() + "Processor: %s, RAM: %d GB, Width: %d m, Height: %d m", processor,ramSize,width,height);
    }

}