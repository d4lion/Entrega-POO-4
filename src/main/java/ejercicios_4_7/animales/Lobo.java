package ejercicios_4_7.animales;

import ejercicios_4_7.animales.models.Canido;

public class Lobo extends Canido {
    @Override
    public String getNombreCientifico() {
        return "Canis lupus";
    }

    @Override
    public String getSonido() {
        return "Aullido";
    }

    @Override
    public String getAlimentos() {
        return "Carnívoro";
    }

    @Override
    public String getHabitat() {
        return "Bosque";
    }
}
