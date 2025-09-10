package jaeger.de.miel;

public class Main {

    public static void main(String[] args) {

        var miel = new Miel();
        var kim = new Kim();
        var isabella = new Isabella();
        var efril = new Efril();

        Person[] persons = { isabella, kim, efril, miel };

        // Polymorphism in action
        for (var person : persons) {
            var hobby = person.doHobby();
            var s = String.format("%s loves %s", person, hobby);
            System.out.println(s);
        }

        System.out.println("Isabella equals Kim: " + isabella.equals(kim));
        System.out.println("Isabella equals Efril: " + isabella.equals(efril));
        System.out.println("Isabella equals Miel: " + isabella.equals(miel));

    }
}
