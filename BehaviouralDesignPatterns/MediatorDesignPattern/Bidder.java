public class Bidder implements Colleague{
    public String name;
    public AuctionManager mediator;
    public Bidder(String name,AuctionManager mediator)
    {
        this.name=name;
        this.mediator=mediator;
    }
    public void recieveNotification(String bidderName,int amount)
    {
        System.out.println("Bid is Placed By "+bidderName+" and the amount placed is "+amount);
    }
    public void putBid(int amount){
        mediator.placeBid(this,amount);
    }

    public String getName(){
        return name;
    }
}