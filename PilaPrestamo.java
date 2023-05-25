
package practica7_22110126;


public class PilaPrestamo {
   public Prestamo pilaPrestamo;
   
   public  PilaPrestamo() {
       pilaPrestamo = null;
   }
   
    public void push(String T, String FS, String FD, String N){
        //Crear el nodo con el valor
        
        Prestamo nuevo = new Prestamo(T, FS, FD, N);
        
        //Para agregar, primero se valida si hay mas nodos o ninguno
        if (pilaPrestamo ==null){
            //se agrega el primer nodo a la pila
            pilaPrestamo = nuevo;
        } else{ //ya existen mas nodos
            //Genera un apuntador auxiliar para referenciar los demas valores
            Prestamo aux = pilaPrestamo;
            //Agregar nuevo nodo al inicio de la pila
            pilaPrestamo = nuevo;
            //Despues del nuevo nodo y se agregan los demas valores
            nuevo.setSiguientePrestamo(aux);
        }
    }
    
    public void recorrerPila(){
        Prestamo aux = pilaPrestamo;
        if (pilaPrestamo==null){
            System.out.println("La pila esta vacia");
        }else{
            while (aux != null) {
                System.out.println("Titulo: " + aux.getTitulo()+ "\n"+ "Fecha Salida: " + aux.getFechaSal()+ "\n"+"Fecha Devolucion: " + aux.getFechaDeb()+ "\n"+"Nombre Alumno: " + aux.getNombre()+ "\n");
                aux = aux.getSiguientePrestamo();
            }
        }
    }
    
    public void pop (){
        //Eliminar el primer elemento de la pila 
        //Genera un  apuntador aux para recorrer la pila
        Prestamo aux = pilaPrestamo;
        if(pilaPrestamo == null) {
            System.out.println("La pila esta vacia");
        } else {
            //Se evalua si existen mas de un elemento en la pila
            if (aux.getSiguientePrestamo()== null) {
                //Existe solamente un elemento en la pila y se elimina
                pilaPrestamo = null;
            } else{
                //Existe mas de un elemento en la pila y se ELIMINA EL PRIMERO
                pilaPrestamo = aux.getSiguientePrestamo();
            }
        }
    }
}



