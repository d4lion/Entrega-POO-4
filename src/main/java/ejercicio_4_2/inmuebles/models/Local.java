package ejercicio_4_2.inmuebles.models;

public class Local extends Inmueble{
    public enum tipo {
        INTERNO,
        CALLE
    }

    public tipo tipoLocal;

    protected Local(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    protected void Localimprimir() {
        super.imprimir();
        System.out.println("Tipo de local: " + this.tipoLocal);
    }
}
