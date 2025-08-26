public interface WeatherPublisher {
    void add(WeatherSubscriber obj);

    void remove(WeatherSubscriber obj);

    void notifyy();

    void update(int date);

    int getData();
}