
package practica7_22110126;


public class NodoPrestamo {
    private Prestamo prestamo;
    private NodoPrestamo siguienteNodo;
    
    public NodoPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
        this.siguienteNodo = null;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public NodoPrestamo getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoPrestamo siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
    
}
