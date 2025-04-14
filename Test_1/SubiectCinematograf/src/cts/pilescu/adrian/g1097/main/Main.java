package cts.pilescu.adrian.g1097.main;

import cts.pilescu.adrian.g1097.prototype.MovieTicket;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // testare prototip

        MovieTicket initialTicket = new MovieTicket("Quick and mad","action","The producers","A movie about a story");

        List<MovieTicket> ticketList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de bilete:");
        int nrOfTickets = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nrOfTickets; i++){
            System.out.println("\"Data\" \"Ora\" \"Locul\"");
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            MovieTicket newTicket = (MovieTicket) (initialTicket.cloneaza());
            newTicket.setData(parts[0]);
            newTicket.setOra(parts[1]);
            newTicket.setLocuri(parts[2]);

            ticketList.add(newTicket);
        }

        for (MovieTicket ticket : ticketList) {
            System.out.println(ticket.print());
        }

    }
}