
package Registro;

/**
 *
 * @author Saul Quimbaya
 */

    public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    private String tipoIdentificacion;
    private String celular;
    private String correo;
    private String direccion;
    private double salario;
    private String empleo;
    private String tipoTrabajo;
    private String estadoCivil;
    private String tipoContrato;
    
    // Constructor
    public Cliente(String nombre, String apellido, String cedula, String tipoIdentificacion,
                   String celular, String correo, String direccion, double salario,
                   String empleo, String tipoTrabajo, String estadoCivil, String tipoContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.tipoIdentificacion = tipoIdentificacion;
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
        this.salario = salario;
        this.empleo = empleo;
        this.tipoTrabajo = tipoTrabajo;
        this.estadoCivil = estadoCivil;
        this.tipoContrato = tipoContrato;
    }
    
    // Métodos getters y setters
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

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
