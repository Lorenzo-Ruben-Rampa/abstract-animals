import interfaces.INuotante;
import interfaces.IVolante;

public class Main {

    public static void faiVolare(IVolante volante) {
        volante.vola();
    }
    
    public static void faiNuotare(INuotante nuotante) {
        nuotante.nuota();
    }
    public static void main(String[] args) {


        Animale cane = new Cane(); 
        Animale delfino = new Delfino();
        Animale aquila = new Aquila();
        Animale passerotto = new Passerotto();

        // Array degli animali
        Animale[] animali = {cane, delfino, aquila, passerotto};

        // Iterazione sugli animali
        for (Animale animale : animali) {
            System.out.println(animale.getClass().getSimpleName() + " fa: " + animale.verso());
            System.out.println("E' un: " + animale.mangia());
            // animale.nuota();
            // animale.vola();
            if (animale instanceof IVolante) {
                faiVolare((IVolante) animale);
            } 
            if (animale instanceof INuotante) {
                faiNuotare((INuotante) animale);
            }
            animale.dormi();
            System.out.println("------------------");
        }
    }
}
