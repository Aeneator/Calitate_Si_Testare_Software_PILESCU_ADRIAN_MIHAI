package ro.cts.pilescu.adrian.F14.models;

public abstract class ParcurgereTraseu {
    public final void parcurgeTraseu(int codTramvai){
        opritStatie1(codTramvai);
        opritStatie2(codTramvai);
        opritStatie3(codTramvai);
        opritStatie4(codTramvai);
        opritStatie5(codTramvai);
        opritStatie6(codTramvai);
    }

    public abstract void opritStatie1(int codTramvai);
    public abstract void opritStatie2(int codTramvai);
    public abstract void opritStatie3(int codTramvai);
    public abstract void opritStatie4(int codTramvai);
    public abstract void opritStatie5(int codTramvai);
    public abstract void opritStatie6(int codTramvai);
}


