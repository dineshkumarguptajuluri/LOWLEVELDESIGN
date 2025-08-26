public class Main {

    public static void main(String[] args) {
        WeatherPublisher publisher = new WeatherPublisherImpl();
        WeatherSubscriber subscriber1 = new WeatherSubscriberImpl(publisher);
        WeatherSubscriber subscriber2 = new WeatherSubscriberImpl(publisher);
        WeatherSubscriber subscriber3 = new WeatherSubscriberImpl(publisher);
        publisher.add(subscriber3);
        publisher.add(subscriber2);
        publisher.add(subscriber1);
        publisher.update(30);
        publisher.update(40);
        publisher.remove(subscriber1);
        publisher.update(20);

    }
}