package ejercicios_4_7.animales;

import ejercicios_4_7.animales.models.Canido;

public class Perro extends Canido {
    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }

    @Override
    public String getSonido() {
        return "Ladrido";
    }

    @Override
    public String getAlimentos() {
        return "Carnívoro";
    }

    @Override
    public String getHabitat() {
        return "Doméstico";
    }
}
