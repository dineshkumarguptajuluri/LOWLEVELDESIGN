import java.util.*;

public class WeatherPublisherImpl implements WeatherPublisher {

    List<WeatherSubscriber> subscribers;
    int data;

    public WeatherPublisherImpl() {
        subscribers = new ArrayList<>();
    }

    public void add(WeatherSubscriber obj) {
        subscribers.add(obj);
        System.out.println("Subscribed Added Succesfully!!!");
    }

    public void remove(WeatherSubscriber obj) {
        subscribers.remove(obj);
        System.out.println("Subscribed Removed Succesfully!!!");
    }

    public void notifyy() {
        for (WeatherSubscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void update(int value) {
        this.data = value;
        System.out.println("Temparature is Updated " + value);
        notifyy();
    }

    public int getData() {
        return this.data;
    }

}