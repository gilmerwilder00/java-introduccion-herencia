package modelos;

public class Perro extends Animal {

    private String raza;


    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public Perro() {
        super();
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // metodo propio
    public void ladrar(){
        System.out.println(nombre + " está ladrando");
    }

    @Override
    public void comer(){
        System.out.println("El perro está comiendo croquetas");
    }

    @Override
    public void dormir(){
        System.out.println("El perro esta durmiendo en la cama");
    }


    
}
