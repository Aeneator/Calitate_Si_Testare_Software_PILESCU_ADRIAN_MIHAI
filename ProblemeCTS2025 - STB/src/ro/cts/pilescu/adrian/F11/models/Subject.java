package ro.cts.pilescu.adrian.F11.models;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
