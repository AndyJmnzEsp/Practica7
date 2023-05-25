/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7_22110126;

public class Alumno {
   
    private int Registro;
    private String Nombre;
    private int Grado;
    private float Promedio;
    private Alumno siguienteAlumno;

    public Alumno(int Registro, String Nombre, int Grado, float Promedio) {
        this.Registro = Registro;
        this.Nombre = Nombre;
        this.Grado = Grado;
        this.Promedio = Promedio;
        this.siguienteAlumno = null;
    }

    

    public int getRegistro() {
        return Registro;
    }

    public void setRegistro(int Registro) {
        this.Registro = Registro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public int getGrado() {
        return Grado;
    }

    public void setGrado(int Grado) {
        this.Grado = Grado;
    }

    public float getPromedio() {
        return Promedio;
    }

    public void setPromedio(float Promedio) {
        this.Promedio = Promedio;
    }

    public Alumno getSiguienteAlumno() {
        return siguienteAlumno;
    }

    public void setSiguienteAlumno(Alumno siguienteAlumno) {
        this.siguienteAlumno = siguienteAlumno;
    }

    
    
    
    
    
   
}
