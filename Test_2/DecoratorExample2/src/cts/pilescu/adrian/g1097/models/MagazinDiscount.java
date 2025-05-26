package cts.pilescu.adrian.g1097.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MagazinDiscount extends MagazinDecorator{

    private Set<Client> listaClienti;


    public MagazinDiscount(Bussiness magazin) {
        super(magazin);
        listaClienti = new HashSet<>();
    }

    @Override
    public double calculeazaPretCosCumparaturi(List<Produs> cosCumparaturi, Client client) {
        if (listaClienti.contains(client)) {
            return super.calculeazaPretCosCumparaturi(cosCumparaturi, client);
        }else{
            listaClienti.add(client);
            return super.calculeazaPretCosCumparaturi(cosCumparaturi, client) * 0.9;
        }

    }
}
