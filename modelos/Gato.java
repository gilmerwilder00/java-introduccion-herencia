package modelos;

public class Gato extends Animal {

    private String colorPelo;


    public Gato(String nombre, int edad, String colorPelo) {
        super(nombre, edad);
        this.colorPelo = colorPelo;
    }

    public Gato(){
        super();
    }
    

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    // metodo propio
    public void maullar(){
        System.out.println(nombre + " está maullando");
    }

    
    @Override
    public void comer(){
        System.out.println("El gato está comiendo su comida");
    }

    @Override
    public void dormir(){
        System.out.println("El gato esta durmiendo en la sofa");
    }
    
}
