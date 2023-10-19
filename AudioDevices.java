public class AudioDevices extends Electronics {
    
    private int volume;
    private boolean bluetooth;

    public AudioDevices(int v, boolean b,int h1,String n,int p,int q,int t,int p1,int w){
        super(n,p,q,t,p1,w);
        this.volume = v;
        this.bluetooth = b;
    }

    public void setVolume(int v){
       this.volume = v;
    }

    public void setBluetooth(boolean b){
        this.bluetooth = b;
    }


    public int getVolume(){
        return volume;
    }

    public boolean getBluetooth(){
        return bluetooth;
    }

    @Override
    public String toString(){
        return String.format(super.toString() + "Volume: %d db, bluetooth: %s", volume,bluetooth);
    }



}