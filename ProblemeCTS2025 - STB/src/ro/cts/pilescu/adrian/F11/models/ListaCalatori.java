package ro.cts.pilescu.adrian.F11.models;

import java.util.ArrayList;
import java.util.List;

public class ListaCalatori implements Subject{
    private List<Observer> listaCalatoriAbonati;

    public ListaCalatori(){
        listaCalatoriAbonati = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer calator){
        if (calator == null){
            System.out.println("Calator invalid");
        }

        listaCalatoriAbonati.add(calator);
    }

    @Override
    public void removeObserver(Observer observer){
        if (observer == null){
            System.out.println("Calator invalid");
        }

        listaCalatoriAbonati.remove(observer);
    }

    @Override
    public void notifyObservers(String mesaj){
        for (var calator : listaCalatoriAbonati){
            calator.notifica(mesaj);
        }
    }
    
    public void pleaca(){
        System.out.println("autobuzul a plecat");
        notifyObservers("autobuzul a plecat");
    }

}
