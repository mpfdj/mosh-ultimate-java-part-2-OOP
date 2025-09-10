package jaeger.de.miel;

public class Miel extends Person {

    public Miel() {
        super("Miel", "De Jaeger", 45, "M");
    }

    @Override
    public String doHobby() {
        return "DJ-ing";
    }

}
