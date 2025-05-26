package ro.cts.pilescu.adrian.F5.models;

public class SistemUsiFacade {

    private AUsa usaFata;
    private AUsa usaMijloc;
    private AUsa usaSpate;

    public SistemUsiFacade() {
        usaFata = new UsaFata();
        usaMijloc = new UsaMijloc();
        usaSpate = new UsaSpate();
    }

    public void toggleUsaFata() {
        usaFata.toggleEsteLibera();
    }

    public void toggleUsaMijloc() {
        usaMijloc.toggleEsteLibera();
    }

    public void toggleUsaSpate(){
        usaSpate.toggleEsteLibera();
    }

    public void deschideFortatUsaFata() {
        usaFata.deschideFortat();
    }

    public void deschideFortatUsaMijloc() {
        usaMijloc.deschideFortat();
    }

    public void deschideFortatUsaSpate() {
        usaSpate.deschideFortat();
    }

    public void elibereazaToateUsile(){
        usaFata.setEsteLibera(true);
        usaMijloc.setEsteLibera(true);
        usaSpate.setEsteLibera(true);
    }

    public void deschideFortatUsi(){
        usaFata.deschideFortat();
        usaMijloc.deschideFortat();
        usaSpate.deschideFortat();
    }

    public void afiseazaStatusUsi(){
        System.out.println("Status usa fata: " + usaFata.esteLiberaStatus());
        System.out.println("Status usa mijloc: " + usaMijloc.esteLiberaStatus());
        System.out.println("Status usa spate: " + usaSpate.esteLiberaStatus());
    }
}
