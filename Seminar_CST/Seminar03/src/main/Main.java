package main;

import modele.AutoritateEager;
import modele.AutoritateLazy;

public class Main {
    public static void main(String[] args) {
        AutoritateEager autoritateEager = AutoritateEager.getInstance();
        System.out.println(autoritateEager.toString());
        autoritateEager.concediaza(1000);

        autoritateEager.setDenumire("ANpPA");
        autoritateEager.setWebsite("www.anpa.ro");

        autoritateEager.emiteAutorizatie("George Cosbuc");

        System.out.println(autoritateEager.toString());

        AutoritateEager autoritateEager2 = AutoritateEager.getInstance();

        autoritateEager2.emiteAutorizatie("Nicky Scorpion");

        System.out.println(autoritateEager2.toString());

        System.out.println();

        AutoritateLazy autoritateLazy = AutoritateLazy.getInstance();
        System.out.println(autoritateLazy.toString());

        AutoritateLazy autoritateLazy2 = AutoritateLazy.getInstance();
        autoritateLazy2.angajeaza(1000);
        System.out.println(autoritateLazy.toString());

    }
}