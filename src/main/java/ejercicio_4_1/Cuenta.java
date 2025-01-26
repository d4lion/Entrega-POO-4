package ejercicio_4_1;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected  float tasaAnual = 0.0f;
    protected float comisionMensual = 0.0f;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        saldo = saldo + cantidad;
        this.numeroConsignaciones++;
        System.out.println(this.numeroConsignaciones);
    }

    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;

        if (nuevoSaldo >= 0 ){
            saldo -= cantidad;
            this.numeroRetiros++;
        } else {
            System.out.println("La cantidad solicitada excede el saldo de la cuenta");
        }
    }

    public void calcularInteres() {
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteres();
    }
}