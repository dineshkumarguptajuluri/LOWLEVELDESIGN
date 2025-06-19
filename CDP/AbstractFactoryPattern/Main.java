public  class Main {
    public static void main(String args[])
    {
        Factory currentFactory = getFactory("Luxury","Ferrari","F14");
        Vehicle currentVehicle = currentFactory.getVehicle();
        LuxuryVehicle luxuryCar = (LuxuryVehicle) currentVehicle;
        luxuryCar.getName();
        luxuryCar.switchRoof();
        luxuryCar.switchRoof();
        currentFactory = getFactory("Ordinary","Toyota","Toyota Model1");
        OrdinaryVehicle ordinary = (OrdinaryVehicle) currentFactory.getVehicle();
        ordinary.getName();
        ordinary.switchWindow();
        ordinary.switchWindow();

    }
    static Factory getFactory(String type,String vehicleName,String modelName){

        if(type.equals("Luxury"))
            return new LuxuryFactory(vehicleName,modelName);

        else if(type.equals("Ordinary"))
            return new OrdinaryFactory(vehicleName,modelName);

        return null;
    }


}