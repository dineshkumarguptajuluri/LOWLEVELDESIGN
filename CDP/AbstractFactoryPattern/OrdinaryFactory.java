public  class OrdinaryFactory implements Factory{
    String vehicleName;
    String modelName;
    OrdinaryFactory(String vehicleName,String modelName)
    {
        this.vehicleName = vehicleName;
        this.modelName = modelName;
    }
    public Vehicle getVehicle(){
        if(this.vehicleName.equals("Toyota"))
            return new Toyota(this.modelName);
        else
            return null;
    }
}