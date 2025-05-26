package ro.cts.pilescu.adrian.A12.models;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subject {

    private List<Observer> listaPacienti;

    public Spital() {
        listaPacienti = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        listaPacienti.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        listaPacienti.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (var observer: listaPacienti){
            observer.notify(mesaj);
        }
    }
}
