package app.example.ruben.porvenir.BaseDatos;

/**
 * Created by RUBEN on 26/11/2017.
 */

public class Pedido {
    String id;
    String nombre;
    String telefono;
    String tipo;
    String descripcion;


    public String getId() {
        return id;
    }

    public void setId(String id) {this.id = id;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
