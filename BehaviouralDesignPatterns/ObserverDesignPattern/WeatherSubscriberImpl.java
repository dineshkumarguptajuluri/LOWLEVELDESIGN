public class WeatherSubscriberImpl implements WeatherSubscriber{
    WeatherPublisher obj;
    public WeatherSubscriberImpl(WeatherPublisher obj)
    {
        this.obj = obj;
    }
    public void update()
    {
        System.out.println("Temparature Got Updated "+obj.getData());
    }

}