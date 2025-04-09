package ro.cts.seminar05.BuilderV2.Main;

import ro.cts.seminar05.BuilderV2.Models.Pacient;
import ro.cts.seminar05.BuilderV2.Models.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder builder = new PacientBuilder();
        Pacient pacient = builder.setNume("George").setAreHalat(true).setArePatRabatabil(true).build("Vasile");
        Pacient pacient1 = builder.setNume("Mihai").setAreHalat(true).setArePatRabatabil(true).build("Marian");
        Pacient pacient2 = builder.setNume("Ion").setAreHalat(true).setArePatRabatabil(true).build("Gogu");

        System.out.println(pacient.toString());
        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());

    }
}