package modelos;

// clase padre
public class Animal {
    // Atributos
    protected String nombre;
    protected int edad;

    //constructores
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Animal(){
        
    }

    // setters y getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // metodos
    public void comer(){
        System.out.println(nombre +  " esta comiendo");
    }

    public void dormir(){
        System.out.println(nombre + " esta durmiendo");
    }

    

    
}
