
package practica7_22110126;

public class NodoLibro {

    private Libro libro;
    private NodoLibro siguienteNodo;

    public NodoLibro(Libro libro) {
        this.libro = libro;
        this.siguienteNodo = null;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public NodoLibro getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoLibro siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
    
    
    
    
    
    
}
