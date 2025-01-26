package ejercicio_4_1;


public class CuentaAhorros extends Cuenta{
    private boolean cuentaActiva;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        cuentaActiva = saldo > 1000;
    }

    public void retirar(float cantidad) {
        if (cuentaActiva) {
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad) {
        if (cuentaActiva){
            super.consignar(cantidad);
        }
    }

    public void extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        cuentaActiva = saldo > 1000;
    }

    public void imprimir() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Comisión mensual: $" + comisionMensual);
        System.out.println("Número de transacciones: " + (super.numeroConsignaciones + super.numeroRetiros + "\n"));
    }
}
