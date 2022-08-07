
public class Estudiante {
    String cedula, nombre;
    double parcial1, parcial2, parcial3, trabajo;
    
    public Estudiante(String cedula, String nombre, double parcial1, double parcial2, double parcial3, double trabajo){
        this.cedula = cedula;
        this.nombre = nombre;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;
        this.trabajo = trabajo;
    }
    
    public Estudiante(){
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getParcial1() {
        return parcial1;
    }

    public void setParcial1(double parcial1) {
        this.parcial1 = parcial1;
    }

    public double getParcial2() {
        return parcial2;
    }

    public void setParcial2(double parcial2) {
        this.parcial2 = parcial2;
    }

    public double getParcial3() {
        return parcial3;
    }

    public void setParcial3(double parcial3) {
        this.parcial3 = parcial3;
    }

    public double getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(double trabajo) {
        this.trabajo = trabajo;
    } 

    @Override
    public String toString() {
        return "Estudiante { " + "cedula = " + cedula + ", nombre = " +
                nombre + ", parcial1 = " + parcial1 + ", parcial2 = " +
                parcial2 + ", parcial3 = " + parcial3 + ", trabajo = " + trabajo + '}';
    }
    
}
