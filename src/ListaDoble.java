
public class ListaDoble {
    NodoDoble primero, ultimo;
    
    public ListaDoble(){
        
        primero = new NodoDoble(null);
        ultimo = primero;
    }
    
    public boolean estaVacia(){
        return primero == ultimo;
    }
    
    public void insertarDespues(NodoDoble nodoInsertar){
        
        /*El apuntador de la siguiente liga del último nodo (derecha), 
        se convierte en la ubicación del nuevo nodo.*/
        
        ultimo.ligaDer = nodoInsertar;
        nodoInsertar.ligaIzq = ultimo;
        nodoInsertar.ligaDer = null;
        ultimo = nodoInsertar;
    }
    
    public void insertarAntes(NodoDoble nodoInsertar){
        
        /*El apuntador de la anterior liga del primer nodo (izquierda), 
        se convierte en la ubicación del nuevo nodo.*/
        
        nodoInsertar.ligaIzq = primero;
        nodoInsertar.ligaDer = primero.ligaDer;
        primero.ligaDer = nodoInsertar;
    }
    
    public void mostrarLista(){
        
        /*Se recorre la lista con un nodo auxiliar. este termina el 
        recorrido, cuando es igual a "null".*/
        
        NodoDoble aux = primero.ligaDer;
        
        while(aux != null){
            System.out.println(aux.getInfo().toString()+" ");
            aux = aux.getLigaDer();
        }
    }
    
    public double promedioNotas(String cedula){
        
        /*Se usan variables para guardar los resultados. se recorreo la
        lista, mientras no sea "null", y se van sumando las notas con 
        sus porcentajes.*/
        
        float acumuladorNota = 0.0f, promedioNota = 0.0f;
        NodoDoble aux = primero.getLigaDer();
        
        while(aux != null){
            if(aux.getInfo().getCedula() == cedula){
                acumuladorNota += (aux.getInfo().getParcial1()*0.15)+
                (aux.getInfo().getParcial2()*0.25)+
                (aux.getInfo().getParcial3()*0.30)+
                (aux.getInfo().getTrabajo()*0.30);
            }
            aux = aux.getLigaDer();
        }
        promedioNota = acumuladorNota;
        
        return promedioNota;
    }
    
    public void mostrarMenoresNotas(ListaDoble miLista){
        
        NodoDoble aux = primero.getLigaDer();
        System.out.println("Estudiantes con notas por debajo de 3.0");
        
        while(aux != null){
            
            /*Si el promedio de notas está por debajo de 3.0, entra al "if".*/

            if(miLista.promedioNotas(aux.getInfo().getCedula()) < 3.0){
                
                System.out.println("El estudiante con cédula " + 
                aux.getInfo().getCedula() + " sacó " +
                miLista.promedioNotas(aux.getInfo().getCedula()));
            }
            
            aux = aux.getLigaDer();
        }
    }
    
    public void mostrarMayoresNotas(ListaDoble miLista){
        NodoDoble aux = primero.getLigaDer();
        System.out.println("Estudiantes con notas por encima de 3.0");
        
        while(aux != null){
            
            /*Si el promedio de notas está por encima de 3.0, entra al "if".*/

            if(miLista.promedioNotas(aux.getInfo().getCedula()) > 3.0){
                
                System.out.println("El estudiante con cédula " + 
                aux.getInfo().getCedula() + " sacó " +
                miLista.promedioNotas(aux.getInfo().getCedula()));
            }
            
            aux = aux.getLigaDer();
        }
    }
    
    public void eliminarEstudiante(String cedula){
        NodoDoble aux = primero.getLigaDer();
        
        /*Se recorreo la lista en tanto no sea "null". Si la cédula ingresada
        coincide con alguna de la lista, se busca el nodo al cual pertenece,
        y se asignan nuevas ligas, para desconectarlo.*/
        
        while(aux != null){
            if(aux.getInfo().getCedula().equals(cedula)){
                aux.getLigaIzq().setLigaDer(aux.getLigaDer());
                aux.getLigaDer().setLigaIzq(aux.getLigaIzq());
                aux = null;
            }
            else{
                aux = aux.getLigaDer();
            }
        }
        System.out.println("El estudiante se eliminó.");
    }
    
    public NodoDoble ultimoNodo(){
        return ultimo;
    }
}
