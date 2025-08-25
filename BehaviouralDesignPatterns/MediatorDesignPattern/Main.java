public class Main {
    public static void main(String[] args) {
        AuctionManager auctionManager = new AuctionManager();
        Bidder one = new Bidder("Dinesh",auctionManager);
        Bidder two = new Bidder("Karthik",auctionManager);
        auctionManager.addColleague(one);
        auctionManager.addColleague(two);
        one.putBid(100);
        two.putBid(200);
        one.putBid(300);
    }
}