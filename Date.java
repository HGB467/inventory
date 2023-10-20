public class Date {

    private int day;
    private int month;
    private int year;

    Date(int d1, int m1, int y1){
         this.day = d1;
         this.month = m1;
         this.year = y1;
    }

    public void setDate(int d1,int m1, int y1){
     this.day = d1;
     this.month = m1;
     this.year = y1;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public String getDate(){
        return String.format("%d/%d/%d", day,month,year);
    }

    @Override
    public String toString(){
        return String.format("%d/%d/%d", day,month,year);
    }

    
}
