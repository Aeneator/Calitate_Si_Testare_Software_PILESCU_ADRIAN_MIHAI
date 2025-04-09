package magnumopus.models;

public class ScaryClown extends Clown{
    // Constructor

    public ScaryClown() {
        super();
    }

    public ScaryClown(String costume, String shoes, String nose) {
        super(costume, shoes, nose);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ScaryClown{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void honk() {
        System.out.println("Honk! Honk! I'm a scary clown!");
    }
}
