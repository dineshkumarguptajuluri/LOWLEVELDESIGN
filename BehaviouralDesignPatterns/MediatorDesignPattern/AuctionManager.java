import  java.util.*;

public class AuctionManager implements Mediator {
    public List<Bidder> colleagueList;

    public AuctionManager() {
        colleagueList = new ArrayList<>();
    }

    public void addColleague(Bidder colleague) {
        colleagueList.add(colleague);
    }

    public void placeBid(Bidder colleague, int amount)
    {
        for(Bidder available:colleagueList)
        {
            if(available!=colleague)
            {
                String nameOfColleague = colleague.getName();
                available.recieveNotification(nameOfColleague,amount);
            }
        }
    }
}