public class InstitutionalPlan implements Plan {
    public int getRate() {
        return 15;
    }

    public void calculateBill(int units) {
        int cost = getRate() * units;
        System.out.println("Cost in Institutional Plan is: " + cost);
    }
}
