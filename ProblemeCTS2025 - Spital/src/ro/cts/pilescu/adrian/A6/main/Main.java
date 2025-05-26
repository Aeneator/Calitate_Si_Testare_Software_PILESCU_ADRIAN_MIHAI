package ro.cts.pilescu.adrian.A6.main;

//A.6. Pentru internarea unui pacient în spital trebuie verificată gravitatea stării pacientului
// prin intermediul clasei Pacient, verificarea confirmării Medicului că trebuie internat, verificarea
// disponibilității unui pat în cameră prin intermediul clasei Salon care are lista cu paturile libere si ocupate.
// Spitalul dorește ca personalul spitalului să nu fi nevoit să facă aceste verificări separat ci să fie dezvoltat
// un modul care să permită această verificarea facilă a acestor lucruri.

import ro.cts.pilescu.adrian.A6.models.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pat patOcupat = new Pat(true, "Marcel");
        Salon salon = new Salon(List.of(patOcupat,new Pat(),new Pat(),new Pat(),new Pat(),new Pat()));
//        Salon salon = new Salon(List.of(patOcupat,patOcupat,patOcupat));
        Medic medic = new Medic("George", "Cardiolog");
        Pacient pacient = new Pacient("Vasile",true,false,true,true);

        Spital spital = new Spital();

        spital.interneazaPacient(pacient,medic,salon);

    }
}