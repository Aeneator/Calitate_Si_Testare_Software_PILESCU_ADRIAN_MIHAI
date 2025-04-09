package magnumopus.models;

public class HappyClown extends Clown {
    public HappyClown() {
        super();
    }

    public HappyClown(String costume, String shoes, String nose) {
        super(costume, shoes, nose);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HappyClown{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }


    @Override
    public void honk() {
        System.out.println("Honk! Honk! I'm a happy clown!");
    }
}
