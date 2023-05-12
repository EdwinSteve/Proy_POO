
package Registro;

/**
 *
 * @author Saul Quimbaya
 */
public class Cajero {
    private String numeroCedula;
    private double monto;

    public Cajero(String numeroCedula, double monto) {
        this.numeroCedula = numeroCedula;
        this.monto = monto;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
   
}
