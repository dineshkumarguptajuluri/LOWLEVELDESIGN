public class Main {
    public static void main(String[] args) {
        WeightMachineInKg obj = new WeightOfBag(new WeightOfRaw());
        System.out.println(obj.getWeight()+" Is The Current Weight");
    }
}