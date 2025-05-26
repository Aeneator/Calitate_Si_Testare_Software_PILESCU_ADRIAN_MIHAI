package ro.cts.pilescu.adrian.F12.models;

public class AutobuzHandler extends ChainHandler{

    @Override
    public void handleRequest(double distanta) {
        if (distanta > 3 && distanta <= 5){
            System.out.println("Autobuzul este disponibil pentru o distanta de " + distanta + " km.");
        }else if (getNextHandler() != null){
            getNextHandler().handleRequest(distanta);
        }else{
            System.out.println("Nu exista un vehicul disponibil pentru distanta de " + distanta + " km.");
        }
    }
}
