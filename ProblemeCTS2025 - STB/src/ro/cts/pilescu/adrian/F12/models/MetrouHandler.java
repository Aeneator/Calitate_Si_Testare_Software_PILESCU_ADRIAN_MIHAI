package ro.cts.pilescu.adrian.F12.models;

public class MetrouHandler extends ChainHandler{

    @Override
    public void handleRequest(double distanta) {
        if (distanta > 10){
            System.out.println("Metroul este o optiune buna pentru distante mari");
        }else if (getNextHandler() != null){
            getNextHandler().handleRequest(distanta);
        }else{
            System.out.println("Nu avem date pentru distanta "+distanta);
        }
    }
}
