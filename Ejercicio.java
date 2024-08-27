import modelos.Gato;
import modelos.Perro;

public class Ejercicio {
    public static void main(String[] args) {

        System.out.println();
        Perro perro1 = new Perro("Firulais", 2, "Labrador");
        perro1.comer();
        perro1.dormir();
        perro1.ladrar(); //metodo propio 

        System.out.println();
        Gato gato = new Gato("Tom", 3, "Negro");
        gato.comer();
        gato.dormir();
        gato.maullar(); // metodo propio

        System.out.println();

        Perro perro2 = new Perro("Firulais", 2, "Labrador");
        Perro perro3 = new Perro("Boby", 2, "Labrador");

        metodo(perro1, perro1);
        metodo(perro1, perro2);
        metodo(perro1, perro3);

        System.out.println();
    }


    public static void metodo(Perro perro1, Perro perro2){
        System.out.println(" perro1.equals(perro2):" + ( perro1.equals(perro2)));
    }
}
