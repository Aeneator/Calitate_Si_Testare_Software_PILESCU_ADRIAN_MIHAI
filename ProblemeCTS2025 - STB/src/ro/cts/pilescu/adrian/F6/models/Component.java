package ro.cts.pilescu.adrian.F6.models;

public abstract class Component {
    protected boolean isGarantieValida = false;
    public abstract void setGarantieValida(boolean status);
    public abstract boolean vizualizeazaGarantie();
    public abstract void afiseazaDetalii(boolean status);

    public abstract void adaugaNod(Component component);
    public abstract void stergeNod(Component component);
    public abstract Component getNodCopil(int index);

}
