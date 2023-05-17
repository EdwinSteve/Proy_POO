
package Registro;

import java.util.Date;

/**
 *
 * @author Saul Quimbaya
 */
public class CuentaDeAhorro {
    private String nombre;
    private String apellido;
    private String cedula;
    private Date fechaApertura;
    private double reporteAhorro;
    private double totalPlata;
   

    public CuentaDeAhorro() {
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getReporteAhorro() {
        return reporteAhorro;
    }

    public void setReporteAhorro(double reporteAhorro) {
        this.reporteAhorro = reporteAhorro;
    }

    public double getTotalPlata() {
        return totalPlata;
    }

    public void setTotalPlata(double totalPlata) {
        this.totalPlata = totalPlata;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", fechaApertura=" + fechaApertura + ", reporteAhorro=" + reporteAhorro + ", totalPlata=" + totalPlata + '}';
    }
    
    
}