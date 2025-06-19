public class Ferrari implements LuxuryVehicle{
    String name;
    boolean roofStatus;
    Ferrari(String name){
        this.name = name;
        this.roofStatus = false;
    }
    public void getName(){
        System.out.println("Vehicle Name is:"+this.name);
    }
    public void switchRoof(){
        this.roofStatus = this.roofStatus ^ true;
        if(this.roofStatus == true)
            System.out.println("Roof Is Opened");
        else
            System.out.println("Roof Is Closed");
    }
}




