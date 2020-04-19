package implementacion;

/**
 *
 * @author mgonzalez
 */
public class Organiza {

    /**
     * Metodo para calcular el mayor de entre 2 numeros
     *
     * @param a Primer valor para el calculo
     * @param b Segundo valor para el calculo
     * @return Retorna el valor mayor entre a y b
     */
    public double calculaMayor(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Metodo para calcular el menor de entre 2 numeros
     *
     * @param a Primer valor para el calculo
     * @param b Segundo valor para el calculo
     * @return Retorna el valor menor entre a y b
     */
    public double calculaMenor(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
