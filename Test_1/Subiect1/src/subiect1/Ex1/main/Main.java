package subiect1.Ex1.main;


import subiect1.Ex1.builders.AbstractBuilder;
import subiect1.Ex1.builders.Builder;
import subiect1.Ex1.models.IBicicleta;

public class Main {
    public static void main(String[] args) {

        AbstractBuilder builder = new Builder();
        builder.setMarca("Audi")
                .setPret(0.0);

        IBicicleta bike = builder.buildBicicleta();

        System.out.println(bike.toString());
        System.out.println("Hello World!");

    }
}