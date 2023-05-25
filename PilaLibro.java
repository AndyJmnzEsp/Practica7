
package practica7_22110126;


public class PilaLibro {
    public Libro pilaLibro;
    
    public PilaLibro() {
        pilaLibro = null;
    }
    
    public void push(String T, String A, String S, int P){
        //Crear el nodo con el valor
        
        Libro nuevo = new Libro(T,A,S,P);
        
        //Para agregar, primero se valida si hay mas nodos o ninguno
        if (pilaLibro ==null){
            //se agrega el primer nodo a la pila
            pilaLibro = nuevo;
        } else{ //ya existen mas nodos
            //Genera un apuntador auxiliar para referenciar los demas valores
            Libro aux = pilaLibro;
            //Agregar nuevo nodo al inicio de la pila
            pilaLibro = nuevo;
            //Despues del nuevo nodo y se agregan los demas valores
            nuevo.setSiguienteLibro(aux);
        }
    }
    
    public void recorrerPila(){
        Libro aux = pilaLibro;
        if (pilaLibro==null){
            System.out.println("La pila esta vacia");
        }else{
            while (aux != null) {
                System.out.println("Titulo: " + aux.getTitulo()+ "\n"+ "Autor: " + aux.getAutor()+ "\n"+"Seccion: " + aux.getSeccion()+ "\n"+"Pasillo: " + aux.getPasillo()+ "\n");
                aux = aux.getSiguienteLibro();
            }
        }
    }
    
    public void pop (){
        //Eliminar el primer elemento de la pila 
        //Genera un  apuntador aux para recorrer la pila
        Libro aux = pilaLibro;
        if(pilaLibro == null) {
            System.out.println("La pila esta vacia");
        } else {
            //Se evalua si existen mas de un elemento en la pila
            if (aux.getSiguienteLibro()== null) {
                //Existe solamente un elemento en la pila y se elimina
                pilaLibro = null;
            } else{
                //Existe mas de un elemento en la pila y se ELIMINA EL PRIMERO
                pilaLibro = aux.getSiguienteLibro();
            }
        }
    }
}

