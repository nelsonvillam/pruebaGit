package implementacion;

/**
 *
 * @author mgonzalez
 */
public class Ejemplo2 {

    private static Ejemplo2 INSTANCE = null;

    private Ejemplo2(){}

    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Ejemplo2();
        }
    }

    public static Ejemplo2 getInstance() {
        if (INSTANCE == null){
            createInstance();
        }
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
