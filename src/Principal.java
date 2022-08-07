
import java.util.Scanner;

public class Principal {
    
    public static String input(String m){
        System.out.print(m);
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
    
    public static double doubleCustom(String s){
        return Double.valueOf(s);
    }    
    
    //Método main, desde donde se ejecuta la el programa.
    public static void main(String[] args) {
        
        
        int opcion = 0;        
        
        //Creación de objetos "estudiantes".
        Estudiante estudiante1 = new Estudiante("111", "Sergio", 1.5, 4.5, 3.2, 3.7);
        Estudiante estudiante2 = new Estudiante("222", "Angie", 0.2, 2.0, 1.5, 0.5);
        Estudiante estudiante3 = new Estudiante("333", "Pedro", 4.6, 3.8, 4.1, 3.3);
        Estudiante estudiante4 = new Estudiante("444", "Alicia", 0.5, 2.3, 1.1, 0.3);
        Estudiante estudiante5 = new Estudiante("555", "Jorge", 4.8, 4.8, 4.6, 3.9);
        Estudiante estudiante6 = new Estudiante("666", "Claudia", 5.0, 3.5, 4.4, 3.7);
        Estudiante estudiante7 = new Estudiante("777", "Miguel", 0.3, 0.4, 0.5, 0.6);
        
        //Creación de la lista.
        ListaDoble miLista = new ListaDoble();
        
        //creación de los nodos.
        NodoDoble nodo1 = new NodoDoble(estudiante1);
        NodoDoble nodo2 = new NodoDoble(estudiante2);
        NodoDoble nodo3 = new NodoDoble(estudiante3);
        NodoDoble nodo4 = new NodoDoble(estudiante4);
        NodoDoble nodo5 = new NodoDoble(estudiante5);
        NodoDoble nodo6 = new NodoDoble(estudiante6);
        NodoDoble nodo7 = new NodoDoble(estudiante7);
        
        //Insertar nodos uno tras otro.
        miLista.insertarDespues(nodo1);
        miLista.insertarDespues(nodo2);
        miLista.insertarDespues(nodo3);
        miLista.insertarDespues(nodo4);
        miLista.insertarDespues(nodo5);
        miLista.insertarDespues(nodo6);
        miLista.insertarDespues(nodo7);
        
        //Ciclo para que el usuario realice operaciones, seleccionando una opción.
        do{
            
            System.out.println("\n\n LISTAS DOBLES");
            System.out.println("1. Mostrar cedulas, nombres, y notas definitivas");
            System.out.println("2. Insertar estudiante antes");
            System.out.println("3. Insertar estudiante después");
            System.out.println("4. Mostrar cédulas con menor nota");
            System.out.println("5. Mostrar cédulas con mayor nota");
            System.out.println("6. Eliminar estudiante por cédula");
            System.out.println("7. Salir");
            
            opcion = (int) doubleCustom(input("Ingrese opción: "));
            
            switch(opcion){
                case 1:
                    miLista.mostrarLista();
                    print(miLista.ultimoNodo().getInfo().getCedula());
                    break;
                case 2:
                    
                    Estudiante nuevoEst = new Estudiante();
                    NodoDoble nuevoNodo = new NodoDoble(nuevoEst);
                    
                    System.out.println("Ingrese los datos del nuevo estudiante");
                    
                    String nombre = input("Ingrese el nombre: ");
                    nuevoEst.setNombre(nombre);
                    
                    String cedula = input("Ingrese la cédula: ");
                    nuevoEst.setCedula(cedula);
                    
                    double parcial1 = doubleCustom(input("Ingrese nota del parcial 1: "));
                    nuevoEst.setParcial1(parcial1);
                    
                    double parcial2 = doubleCustom(input("Ingrese nota del parcial 2: "));
                    nuevoEst.setParcial2(parcial2);
                    
                    double parcial3 = doubleCustom(input("Ingrese nota del parcial 3: "));
                    nuevoEst.setParcial3(parcial3);
                    
                    double trabajo = doubleCustom(input("Ingrese nota del trabajo: "));
                    nuevoEst.setTrabajo(trabajo);
                    
                    miLista.insertarAntes(nuevoNodo);
                    break;
                    
                case 3:
                    
                    nuevoEst = new Estudiante();
                    nuevoNodo = new NodoDoble(nuevoEst);
                    
                    System.out.println("Ingrese los datos del nuevo estudiante");
                    
                    nombre = input("Ingrese el nombre: ");
                    nuevoEst.setNombre(nombre);
                    
                    
                    cedula = input("Ingrese la cédula: ");
                    nuevoEst.setCedula(cedula);
                    
                    parcial1 = doubleCustom(input("Ingrese nota del parcial 1: "));
                    nuevoEst.setParcial1(parcial1);
                    
                    parcial2 = doubleCustom(input("Ingrese nota del parcial 2: "));
                    nuevoEst.setParcial2(parcial2);
                    
                    parcial3 = doubleCustom(input("Ingrese nota del parcial 3: "));
                    nuevoEst.setParcial3(parcial3);
                    
                    trabajo = doubleCustom(input("Ingrese nota del trabajo: "));
                    nuevoEst.setTrabajo(trabajo);
                    
                    miLista.insertarDespues(nuevoNodo);
                    break;
                    
                case 4:
                    System.out.println("Estudiantes con las menores notas: ");
                    
                    miLista.mostrarMenoresNotas(miLista);
                    break;
                    
                case 5:
                    System.out.println("Estudiantes con las mayores notas: ");
                    
                    miLista.mostrarMayoresNotas(miLista);
                    break;
                    
                case 6:
                    cedula = input("Ingrese la cédula a eliminar: ");
                    miLista.eliminarEstudiante(cedula);
                    
                    System.out.println("El estudiante " + cedula + " fue eliminado.");
            }
            
        }
        while(opcion != 7);
        
    }
    
    public static void print(Object o){
        System.out.println(o);
    }
}
