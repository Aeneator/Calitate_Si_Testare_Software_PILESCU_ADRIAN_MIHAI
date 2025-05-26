package ro.cts.pilescu.adrian.F12.models;

public class TroleibuzHandler extends ChainHandler{

    @Override
    public void handleRequest(double distanta) {
        if (distanta <= 3){
            System.out.println("Se recomanda troleibuzul");
        }else if (getNextHandler() != null) {
            getNextHandler().handleRequest(distanta);
        }else{
            System.out.println("Nu avem date pentru distanta " + distanta);
        }
    }
}
