package jaeger.de.miel;

public class Kim extends Person {

    public Kim() {
        super("Kim", "De Jaeger", 16, "F");
    }

    @Override
    public String doHobby() {
        return "Volleyball";
    }
}
