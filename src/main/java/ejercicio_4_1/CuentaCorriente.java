package ejercicio_4_1;

public class CuentaCorriente extends Cuenta{
    float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public void retirar(float cantidad) {
        float resultado = saldo - cantidad;

        if (resultado < 0) {
            sobregiro = sobregiro - resultado;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad) {
        float residuo = sobregiro - cantidad;

        if (sobregiro > 0) {
            if ( residuo > 0) {
                sobregiro = 0;
                saldo = residuo;
            } else {
                sobregiro = -residuo;
                saldo = 0;
            }
        } else {
            super.consignar(cantidad);
        }
    }

    public void extractoMensual() {
        super.extractoMensual();
    }

    public void imprimir() {
        System.out.println("Saldo = $ “ + saldo");
        System.out.println("Cargo mensual = $" + comisionMensual);
        System.out.println("Número de transacciones ="  + (numeroConsignaciones + numeroRetiros));
        System.out.println("Valor de sogregiro = $" + (numeroConsignaciones + numeroRetiros) + "\n");
    }
}
