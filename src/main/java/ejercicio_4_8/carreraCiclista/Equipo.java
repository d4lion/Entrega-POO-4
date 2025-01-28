package ejercicio_4_8.carreraCiclista;

import java.util.*;


public class Equipo {
    private String nombre;
    private static double totalTiempo = 0;
    private String pais;
    Vector listaCiclista;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Vector getListaCiclista() {
        return listaCiclista;
    }

    public void setListaCiclista(Vector listaCiclista) {
        this.listaCiclista = listaCiclista;
    }

    public static double getTotalTiempo() {
        return totalTiempo;
    }

    public static void setTotalTiempo(double totalTiempo) {
        Equipo.totalTiempo = totalTiempo;
    }



    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        listaCiclista = new Vector();
    }

    void addCiclista(Ciclista c) {
        listaCiclista.add(c);
    }

    void listarEquipo() {
        for (Object o : listaCiclista) {
            Ciclista c = (Ciclista) o;
            System.out.println("Nombre: " + c.getNombre() + " \nTiempo: " + c.getTiempoAcumulado() + "\n");
        }
    }

    void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        String nombreCiclista = sc.next();
        for (int i = 0; i < listaCiclista.size(); i++) {
            Ciclista c = (Ciclista) listaCiclista.elementAt(i);
            if (c.getNombre().equals(nombreCiclista)) {
                System.out.println(c.getNombre());
            }
        }
    }

    void calcularTotalTiempo() {
        for (int i = 0; i < listaCiclista.size(); i++) {
            Ciclista c = (Ciclista) listaCiclista.elementAt(i);
            totalTiempo = totalTiempo + c.getTiempoAcumulado();
        }
    }

    void imprimir() {
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("País: " + pais);
        System.out.println("Total tiempo del equipo: " + totalTiempo);
    }

}
