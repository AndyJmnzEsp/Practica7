
package practica7_22110126;


public class Libro {
    
    private String Titulo;
    private String Autor;
    private String Seccion;
    private int Pasillo;
    private Libro siguienteLibro;

    public Libro(String Titulo,String Autor, String Seccion, int Pasillo) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Seccion = Seccion;
        this.Pasillo = Pasillo;
        this.siguienteLibro = null;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public int getPasillo() {
        return Pasillo;
    }

    public void setPasillo(int Pasillo) {
        this.Pasillo = Pasillo;
    }

    public Libro getSiguienteLibro() {
        return siguienteLibro;
    }

    public void setSiguienteLibro(Libro siguienteLibro) {
        this.siguienteLibro = siguienteLibro;
    }
    
    
    
    
}
