import interfaces.Movement;

public class Aquila extends Animale implements Movement {

    @Override
    public void vola() {
        System.out.println("Sto volando");
    }

    @Override
    public void nuota() {
        System.out.println("L'aquila non nuota");
    }

    @Override
    public String verso() {
      return "Kreeek";
    }

    @Override
    public String mangia() {
        return "Carnivoro";
    }

}
