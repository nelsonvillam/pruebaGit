package implementacion;

/**
 *
 * @author mgonzalez
 */
public class Ejemplo1 {

    private static final Ejemplo1 INSTANCE = new Ejemplo1();

    private Ejemplo1() {}

    public static Ejemplo1 getInstance() {
        return INSTANCE;
    }
    
    /**
     * Permite dividir 2 numeros
     *
     * @param numero1
     * @param numero2
     * @return
     */
    public double dividir(double numero1, double numero2) {
        return (numero1 / numero2);
    }
    
}
