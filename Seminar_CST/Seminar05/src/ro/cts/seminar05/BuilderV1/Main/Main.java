package ro.cts.seminar05.BuilderV1.Main;

import ro.cts.seminar05.BuilderV1.Models.Pacient;
import ro.cts.seminar05.BuilderV1.Models.PacientBuilder;

public class Main {
    public static void main(String[] args) {

        PacientBuilder pacientBuilder = new PacientBuilder("George");
        Pacient pacient = pacientBuilder.setNumeInsotitor("Marius");
        System.out.println(pacient);
    }
}