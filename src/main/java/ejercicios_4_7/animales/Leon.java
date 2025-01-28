package ejercicios_4_7.animales;

import ejercicios_4_7.animales.models.Felino;

public class Leon extends Felino {
    @Override
    public String getNombreCientifico() {
        return "Panthera leo";
    }

    @Override
    public String getSonido() {
        return "Rugido";
    }

    @Override
    public String getAlimentos() {
        return "Carnívoro";
    }

    @Override
    public String getHabitat() {
        return "Praderas";
    }
}
