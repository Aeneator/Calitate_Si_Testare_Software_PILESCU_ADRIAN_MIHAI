package abstractfactory.models;

public class Clown {

    public String costume;
    public String shoes;
    public String nose;

    public Clown(){
        this.costume = "default costume";
        this.shoes = "default shoes";
        this.nose = "default nose";
    }

    public Clown(String costume, String shoes, String nose) {
        this.costume = costume;
        this.shoes = shoes;
        this.nose = nose;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clown{");
        sb.append("costume='").append(costume).append('\'');
        sb.append(", shoes='").append(shoes).append('\'');
        sb.append(", nose='").append(nose).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void honk(){
        System.out.println("Honk! Honk! I'm a clown!");
    }
}
