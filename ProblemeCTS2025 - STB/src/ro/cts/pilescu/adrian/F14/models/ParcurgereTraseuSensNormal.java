package ro.cts.pilescu.adrian.F14.models;

public class ParcurgereTraseuSensNormal extends ParcurgereTraseu {

    @Override
    public void opritStatie1(int codTramvai) {
        System.out.println("Tramvaiul " + codTramvai + " a oprit în Stația 1");
    }

    @Override
    public void opritStatie2(int codTramvai) {
        System.out.println("Tramvaiul " + codTramvai + " a oprit în Stația 2");
    }

    @Override
    public void opritStatie3(int codTramvai) {
        System.out.println("Tramvaiul " + codTramvai + " a oprit în Stația 3");
    }

    @Override
    public void opritStatie4(int codTramvai) {
        System.out.println("Tramvaiul " + codTramvai + " a oprit în Stația 4");
    }

    @Override
    public void opritStatie5(int codTramvai) {
        System.out.println("Tramvaiul " + codTramvai + " a oprit în Stația 5");
    }

    @Override
    public void opritStatie6(int codTramvai) {
        System.out.println("Tramvaiul " + codTramvai + " a oprit în Stația 6");
    }
}
