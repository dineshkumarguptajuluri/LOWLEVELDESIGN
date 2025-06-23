
public  class DomesticPlan implements Plan{
    public int getRate()
    {
        return 10;
    }
    public void calculateBill(int units){
        int rate = this.getRate();
        int cost = rate*units;
        System.out.println("Cost in Domestic Plan is: "+cost);
    }

}