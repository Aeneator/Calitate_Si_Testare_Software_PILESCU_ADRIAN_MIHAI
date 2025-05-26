package ro.cts.pilescu.adrian.F6.models;

public class Autobuz extends Component{

    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz() {
        producator = "N/A";
        model = "N/A";
        nrLocuri = 0;
    }

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afiseazaDetalii(boolean status) {
        if (status == isGarantieValida) {
            final StringBuilder sb = new StringBuilder("Autobuz{");
            sb.append("producator='").append(producator).append('\'');
            sb.append(", model='").append(model).append('\'');
            sb.append(", nrLocuri=").append(nrLocuri);
            sb.append(", isGarantieValida=").append(isGarantieValida);
            sb.append('}');
            System.out.println(sb.toString());
        }
    }

    @Override
    public void setGarantieValida(boolean status){
        this.isGarantieValida  = status;
    }

    @Override
    public boolean vizualizeazaGarantie() {
        return isGarantieValida;
    }

    @Override
    public void adaugaNod(Component component){
        System.out.println("Nu se pot adauga noduri la autobuze");
    }

    @Override
    public void stergeNod(Component component){
        System.out.println("Nu se pot sterge noduri la autobuze");
    }

    @Override
    public Component getNodCopil(int index){
        System.out.println("Nu se pot obtine noduri la autobuze");
        return null;
    }

}
