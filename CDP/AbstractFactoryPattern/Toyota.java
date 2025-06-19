public class Toyota implements OrdinaryVehicle{
    String name;
    boolean windowStatus;
    Toyota(String name){
        this.name = name;
        this.windowStatus = false;
    }
    public void getName(){
        System.out.println("Vehicle Name is:"+this.name);
    }
    public void switchWindow(){
        this.windowStatus = this.windowStatus ^ true;
        if(this.windowStatus == true)
            System.out.println("Window Is Opened");
        else
            System.out.println("Window Is Closed");
    }
}