public class GetPlanFactory {
    public Plan getPlan(String planName)
    {
        System.out.println(planName);
        if(planName.equals("Domestic Plan"))
            return new DomesticPlan();
        else if(planName.equals("Institutional Plan"))
            return new InstitutionalPlan();
        return null;
    }
}