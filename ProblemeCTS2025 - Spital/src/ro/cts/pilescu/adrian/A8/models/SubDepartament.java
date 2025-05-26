package ro.cts.pilescu.adrian.A8.models;

import java.util.ArrayList;
import java.util.List;

public class SubDepartament implements Component{
    private List<Component> listaComponente;
    private String numeSubDepartament;

    public SubDepartament( String numeSubDepartament) {
        this.listaComponente = new ArrayList<>();
        this.numeSubDepartament = numeSubDepartament;
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
    public Component getNod(int index) {
        return listaComponente.get(index);
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Sub Departament{");
        sb.append(", numeSubDepartament='").append(numeSubDepartament).append('\'');
        sb.append('}');
        System.out.println(sb);

        for (Component component : listaComponente) {
            component.afiseazaDetalii();
        }
    }


}
