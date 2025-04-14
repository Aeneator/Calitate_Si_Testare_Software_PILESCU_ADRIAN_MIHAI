package cts.pilescu.adrian.g1097.main;

import cts.pilescu.adrian.g1097.factory.SubscriptionFactory;
import cts.pilescu.adrian.g1097.models.MobilityXFactory;
import cts.pilescu.adrian.g1097.models.MobilityYFactory;
import cts.pilescu.adrian.g1097.models.MobilityZFactory;
import cts.pilescu.adrian.g1097.models.Subscription;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nrAbonamente = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0 ; i < nrAbonamente ; i++){
            System.out.println("Introduceti tipul de abonament: ");
            System.out.println("1. Abonament MobilityX");
            System.out.println("2. Abonament MobilityY");
            System.out.println("3. Abonament MobilityZ");

            int tipAbonament = scanner.nextInt();

            SubscriptionFactory factory = null;
            switch (tipAbonament){
                case 1:
                    factory = new MobilityXFactory();
                    break;
                case 2:
                    factory = new MobilityYFactory();
                    break;
                case 3:
                    factory = new MobilityZFactory();
                    break;
                default:
                    System.out.println("Tip de abonament invalid");
                    break;
            }

            if (factory != null){
                System.out.println("Introduceti costul lunar: ");
                float costLunar = scanner.nextFloat();
                scanner.nextLine();

                System.out.println("Introduceti numarul de luni: ");
                int nrLuni = scanner.nextInt();
                scanner.nextLine();

                Subscription abonament = factory.createSubscription(costLunar);
                System.out.println(abonament.toString());
                System.out.println("Cost total: " + abonament.totalCosts(nrLuni));
            }

        }
    }
}