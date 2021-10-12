package designPatterns.observerPattern.observerPatternUsingWeatherStation;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
