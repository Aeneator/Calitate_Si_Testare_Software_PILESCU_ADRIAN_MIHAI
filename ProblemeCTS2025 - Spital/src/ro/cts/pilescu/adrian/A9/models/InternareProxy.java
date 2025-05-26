package ro.cts.pilescu.adrian.A9.models;

public class InternareProxy implements Internare{
    private Internare internareSpital;

    @Override
    public void interneazaPacient(Pacient pacient) {
        if (!pacient.isAreAsigurareMedicala()){
            System.out.println("Pacientul nu are asigurare medicala. Nu se poate interna.");
        }else{
            if (internareSpital == null){
                internareSpital = new InternareSpital();
            }
            internareSpital.interneazaPacient(pacient);
        }
    }
}
