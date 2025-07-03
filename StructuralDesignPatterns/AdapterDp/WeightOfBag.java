public class WeightOfBag implements WeightMachineInKg {
    WeightMachineInPound obj;
    WeightOfBag(WeightMachineInPound obj)
    {
        this.obj = obj;
    }
    public double getWeight()
    {
        return 0.45*obj.getWeight();
    }
}