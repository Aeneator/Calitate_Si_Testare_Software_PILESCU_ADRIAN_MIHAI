package ro.cts.pilescu.adrian.F6.models;

import java.util.ArrayList;
import java.util.List;

public class Grup extends Component{

    private List<Component> listaComponente;

    public Grup() {
        listaComponente = new ArrayList<>();
    }


    @Override
    public void setGarantieValida(boolean status) {
        System.out.println("Grupul nu are garantie");
    }

    @Override
    public boolean vizualizeazaGarantie() {
        return false;
    }

    @Override
    public void afiseazaDetalii(boolean status) {
        for(Component component : listaComponente) {
            component.afiseazaDetalii(status);
        }
    }

    @Override
    public void adaugaNod(Component component) {
        listaComponente.add(component);
    }

    @Override
    public void stergeNod(Component component) {
        listaComponente.remove(component);
    }

    @Override
    public Component getNodCopil(int index) {
        return listaComponente.get(index);
    }
}
