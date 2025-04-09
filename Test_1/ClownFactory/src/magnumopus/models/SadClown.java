package magnumopus.models;

public class SadClown extends Clown{
    public SadClown() {
        super();
    }

    public SadClown(String costume, String shoes, String nose) {
        super(costume, shoes, nose);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SadClown{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void honk() {
        System.out.println("Honk! Honk! I'm a sad clown!");
    }
}
