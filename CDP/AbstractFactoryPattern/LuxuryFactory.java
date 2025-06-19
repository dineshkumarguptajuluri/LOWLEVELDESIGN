public  class LuxuryFactory implements Factory{
    String vehicleName;
    String modelName;
    LuxuryFactory(String vehicleName,String modelName)
    {
        this.vehicleName = vehicleName;
        this.modelName = modelName;
    }
    public Vehicle getVehicle(){
        if(this.vehicleName.equals("Ferrari"))
            return new Ferrari(this.modelName);
        else
            return null;
    }
}