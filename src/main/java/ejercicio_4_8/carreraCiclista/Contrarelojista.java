package ejercicio_4_8.carreraCiclista;

public class Contrarelojista extends Ciclista {
    private double velocidadMaxima;


    public Contrarelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    protected void imprimir() {
        super.imprimir();
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }

    @Override
    String imprimirTipo() {
        return "Es un contrarelojista";
    }
}
