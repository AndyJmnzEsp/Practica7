
package practica7_22110126;

public class PilaAlumno {
    public Alumno pila;

    public PilaAlumno() {
        pila = null;
    }
    
    public void push(int R, String N, int G, float P){
        //Crear el nodo con el valor
        
        Alumno nuevo = new Alumno(R,N,G,P);
        
        //Para agregar, primero se valida si hay mas nodos o ninguno
        if (pila ==null){
            //se agrega el primer nodo a la pila
            pila = nuevo;
        } else{ //ya existen mas nodos
            //Genera un apuntador auxiliar para referenciar los demas valores
            Alumno aux = pila;
            //Agregar nuevo nodo al inicio de la pila
            pila = nuevo;
            //Despues del nuevo nodo y se agregan los demas valores
            nuevo.setSiguienteAlumno(aux);
        }
    }
    
    public void recorrerPila(){
        Alumno aux = pila;
        if (pila==null){
            System.out.println("La pila esta vacia");
        }else{
            while (aux != null) {
                System.out.println("Registro: " + aux.getRegistro() + "\n"+ "Nombre: " + aux.getNombre()+ "\n"+"Grado: " + aux.getGrado()+ "\n"+"Promedio: " + aux.getPromedio()+ "\n");
                aux = aux.getSiguienteAlumno();
            }
        }
    }
    
    public void pop (){
        //Eliminar el primer elemento de la pila 
        //Genera un  apuntador aux para recorrer la pila
        Alumno aux = pila;
        if(pila == null) {
            System.out.println("La pila esta vacia");
        } else {
            //Se evalua si existen mas de un elemento en la pila
            if (aux.getSiguienteAlumno()== null) {
                //Existe solamente un elemento en la pila y se elimina
                pila = null;
            } else{
                //Existe mas de un elemento en la pila y se ELIMINA EL PRIMERO
                pila = aux.getSiguienteAlumno();
            }
        }
    }
}
