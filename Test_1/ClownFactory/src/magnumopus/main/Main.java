package magnumopus.main;

import magnumopus.SimpleFactory.ClownFactory;
import magnumopus.SimpleFactory.ClownTypes;
import magnumopus.SimpleFactory.SimpleFactory;
import magnumopus.models.Clown;

public class Main {
    public static void main(String[] args) {
        SimpleFactory ClownFactory = new ClownFactory();
        Clown clown1 = ClownFactory.createClown(ClownTypes.SadClown, "red", "big", "red");
        Clown clown2 = ClownFactory.createClown(ClownTypes.HappyClown, "blue", "small", "blue");
        Clown clown3 = ClownFactory.createClown(ClownTypes.ScaryClown, "green", "large", "green");

        System.out.println(clown1);
        System.out.println(clown2);
        System.out.println(clown3);

    }
}