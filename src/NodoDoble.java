
public class NodoDoble {
    Estudiante info;
    NodoDoble ligaIzq = null, ligaDer = null;
    
    //CONSTRUCTOR
    public NodoDoble(Estudiante info){
        
        this.info = info;
        ligaIzq = null;
        ligaDer = null;
    }

    public Estudiante getInfo() {
        return info;
    }

    public void setInfo(Estudiante dato) {
        this.info = dato;
    }

    public NodoDoble getLigaIzq() {
        return ligaIzq;
    }

    public void setLigaIzq(NodoDoble ligaIzq) {
        this.ligaIzq = ligaIzq;
    }

    public NodoDoble getLigaDer() {
        return ligaDer;
    }

    public void setLigaDer(NodoDoble ligaDer) {
        this.ligaDer = ligaDer;
    }
    
    
}
