package ro.cts.pilescu.adrian.A8.models;

public interface Component {

    void afiseazaDetalii();
    void adaugaNod(Component component);
    void stergeNod(Component component);
    Component getNod(int index);

}
