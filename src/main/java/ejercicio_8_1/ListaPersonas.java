package ejercicio_8_1;

import java.util.*;

public class ListaPersonas {
    Vector listaPersonas;

    public ListaPersonas() {
        listaPersonas = new Vector(); // Crea el vector de personas
    }

    public void anadirPersona(Persona p) {
        listaPersonas.add(p);
    }

    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
    }

    public void borrarLista() {
        listaPersonas.removeAllElements();
    }
}