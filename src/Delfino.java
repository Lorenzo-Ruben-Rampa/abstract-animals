import interfaces.Movement;
import interfaces.INuotante;
// public class Delfino extends Animale implements Movement {
public class Delfino extends Animale implements INuotante{

    // @Override
    // public void vola() {
    //     System.out.println("Il delfino non vola");
    // }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando");
    }

    @Override
    public String verso() {
        return "Splash";
    }

    @Override
    public String mangia() {
        return "Carnivoro";
    }

}
