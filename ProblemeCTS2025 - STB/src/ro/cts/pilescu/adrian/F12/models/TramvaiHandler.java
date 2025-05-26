package ro.cts.pilescu.adrian.F12.models;

public class TramvaiHandler extends ChainHandler{

    @Override
    public void handleRequest(double distanta) {
        if (distanta > 5 && distanta <= 10 ){
            System.out.println("Tramvaiul este disponibil pentru o distanta de " + distanta + " km");
        }else if (getNextHandler() != null){
            getNextHandler().handleRequest(distanta);
        }else{
            System.out.println("Nu exista un mijloc de transport disponibil pentru distanta de " + distanta + " km");
        }
    }
}
