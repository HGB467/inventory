public class Grocery extends Product {

    private Date expirationDate;
    private int proteinAmount;
    private int fatAmount;
    private int carbsAmount;

    public Grocery(String n,int p,int q,int t,Date d1,int protein,int fat, int carbs){
        super(n,p,q,t,ProductType.GROCERY);
        this.expirationDate = d1;
        this.proteinAmount = protein;
        this.fatAmount = fat;
        this.carbsAmount = carbs;
    }

    public void setExpirationDate(Date d){
       this.expirationDate = d;
    }

    public Date getExpirationDate(){
        return expirationDate;
    }

    public void setProteinAmount(int p){
       this.proteinAmount = p;
    }

    public int getProteinAmount(){
        return proteinAmount;
    }

    public void setFatAmount(int f1){
        this.fatAmount = f1;
    }

    public int getFatAmount(){
        return fatAmount;
    }

    public void setCarbsAmount(int c1){
          this.carbsAmount = c1;
    }

    public int getCarbsAmount(){
        return carbsAmount;
    }

    @Override
    public String toString(){
        return String.format(super.toString() + "Expiration Date: %s, Protein %: %d, Fat %: %d, Carbs: %d ", expirationDate,proteinAmount,fatAmount,carbsAmount);
    }

    
}
