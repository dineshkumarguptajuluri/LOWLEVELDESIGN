public class Main {
    public static void main(String args[]) {
        GetPlanFactory factory = new GetPlanFactory();

        Plan plan1 = factory.getPlan("Domestic Plan");
        if (plan1 != null) {
            plan1.calculateBill(30);
        }

        Plan plan2 = factory.getPlan("Institutional Plan");
        if (plan2 != null) {
            plan2.calculateBill(30);
        }
    }
}