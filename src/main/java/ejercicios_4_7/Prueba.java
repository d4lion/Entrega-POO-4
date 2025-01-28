package ejercicios_4_7;

import ejercicios_4_7.animales.Gato;
import ejercicios_4_7.animales.Leon;
import ejercicios_4_7.animales.Lobo;
import ejercicios_4_7.animales.Perro;
import ejercicios_4_7.animales.models.Animal;

public class Prueba {
    public static void main(String ... args) {
        Animal[] animales = new Animal[4];

        animales[0] = new Perro();
        animales[1] = new Leon();
        animales[2] = new Gato();
        animales[3] = new Lobo();

        for (Animal animal : animales) {
            System.out.println("Nombre científico: " + animal.getNombreCientifico());
            System.out.println("Sonido: " + animal.getSonido());
            System.out.println("Alimentos: " + animal.getAlimentos());
            System.out.println("Habitat: " + animal.getHabitat() + "\n");
        }
    }
}
