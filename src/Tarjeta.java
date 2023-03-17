import java.time.LocalDate;

public abstract class Tarjeta {
    protected String marca = "";
    protected String nroTarjeta = "";
    protected String cardHolder = "";
    protected String fechaVencimiento; // asumo que la fecha viene en formato MM/yy
    protected int mesVencimiento = 0;
    protected int añoVencimiento = 0;
    protected float tasa = 0;

    private

    public Tarjeta(String marca, String nroTarjeta, String cardHolder, String fechaVencimiento){
        this.cardHolder = cardHolder;
        this.marca = marca;
        this.fechaVencimiento = fechaVencimiento;
        this.nroTarjeta = nroTarjeta;
        String[] fecha = fechaVencimiento.split("/");
        if(fecha[0].startsWith("0")){
            mesVencimiento = Character.getNumericValue(fecha[0].charAt(1));
        } else{
            mesVencimiento = Integer.parseInt(fecha[0]);
        }
        añoVencimiento = Integer.parseInt(fecha[1]);
    }

    protected abstract float calcularTasa();

    public void getInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Numero de Tarjeta: " + nroTarjeta);
        System.out.println("CardHolder: " + cardHolder);
        System.out.println("Fecha vencimiento: " + fechaVencimiento);
    }
}
