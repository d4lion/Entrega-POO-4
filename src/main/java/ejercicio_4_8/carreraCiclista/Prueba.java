package ejercicio_4_8.carreraCiclista;

public class Prueba {
    public static void main(String ... args) {
        Equipo eq1 = new Equipo("Sprinter", "Colombia");

        Velocista v1 = new Velocista(123979, "Geraint Thomas", 320, 25);
        Escalador e1 = new Escalador(123980, "Egan Bernal", 25, 10);
        Contrarelojista c1 = new Contrarelojista(123981, "Jonathan Castroviejo", 120);

        eq1.addCiclista(v1);
        eq1.addCiclista(e1);
        eq1.addCiclista(c1);

        v1.setTiempoAcumulado(365);
        e1.setTiempoAcumulado(385);
        c1.setTiempoAcumulado(370);

        eq1.calcularTotalTiempo();
        eq1.imprimir();
        eq1.listarEquipo();
    }
}
