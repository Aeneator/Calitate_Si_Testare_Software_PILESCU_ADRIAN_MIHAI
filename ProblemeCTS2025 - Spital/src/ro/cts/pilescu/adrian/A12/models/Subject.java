package ro.cts.pilescu.adrian.A12.models;

public interface Subject {

    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteNotificare(String mesaj);
}
