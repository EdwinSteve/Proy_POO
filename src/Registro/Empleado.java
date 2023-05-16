package Registro;

public class Empleado {
    private String nombre;
    private String apellido;
    private int cedula;
    private String fechaIngreso;
    private String sucursal;
    private String correo;
    private String telefono;
    private String direccion;

    public Empleado(String nombre, String apellido, int cedula, String fechaIngreso, String sucursal,String correo, String telefono, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaIngreso = fechaIngreso;
        this.sucursal = sucursal;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getSucursal() {
        return sucursal;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
}