import interfaces.Movement;
public abstract class Animale implements Movement {

    public void vola() {
        System.out.println("L'animale vola/non vola");
    }

    public void nuota() {
        System.out.println("L'animale nuota/non nuota");
    }

    // Metodi astratti
    public abstract String verso();

    public abstract String mangia();

    // Metodo concreto
    public void dormi() {
        System.out.println("Zzz");
    }
}
