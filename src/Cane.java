import interfaces.Movement;
public class Cane extends Animale implements Movement {

    @Override
    public void vola() {
        System.out.println("Il cane non vola");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando");
    }

    @Override
    public String verso() {
       return "Bau";
    }

    @Override
    public String mangia() {
       return "Carnivoro";
    }
}
