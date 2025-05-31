import interfaces.Movement;

public class Passerotto extends Animale implements Movement {

    @Override
    public void vola() {
        System.out.println("Sto volando");
    }

    @Override
    public void nuota() {
        System.out.println("Il passerotto non nuota");
    }

    @Override
    public String verso() {
        return "Cip";
    }

    @Override
    public String mangia() {
        return "Granivoro";
    }

}
