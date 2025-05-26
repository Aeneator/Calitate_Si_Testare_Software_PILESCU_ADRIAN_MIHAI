package cts.pilescu.adrian.g1097.models;

import java.util.List;

public abstract class MagazinDecorator implements Bussiness{
    private Bussiness magazin;

    public MagazinDecorator(Bussiness magazin){
        this.magazin = magazin;
    }

    @Override
    public double calculeazaPretCosCumparaturi(List<Produs> cosCumparaturi, Client client) {
        return magazin.calculeazaPretCosCumparaturi(cosCumparaturi, client);
    }
}
