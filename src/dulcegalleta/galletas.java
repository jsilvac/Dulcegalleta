
package dulcegalleta;

/**
 *
 * @author Jaimiko
 */
public class galletas {
    
    int codido;
    double precio;
    String Descripcion;

    public int getCodido() {
        return codido;
    }

    public void setCodido(int codido) {
        this.codido = codido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public galletas(int codido, double precio, String descripcion ) {
        this.codido = codido;
        this.precio = precio;
        this.Descripcion= descripcion;
    }
    
}
