import java.time.LocalDate;

public class Tarjeta {
    private Marca marca;
    private String nroTarjeta = "";
    private String cardHolder = "";
    private String fechaVencimiento; // asumo que la fecha viene en formato MM/yy
    private int mesVencimiento = 0;
    private int añoVencimiento = 0;
    private float tasa = 0;
    private float gasto = 0;
    private float importe = 0;


    public Tarjeta(Marca marca, String nroTarjeta, String cardHolder, String fechaVencimiento,int gasto){
        this.cardHolder = cardHolder;
        this.marca = marca;
        this.fechaVencimiento = fechaVencimiento;
        this.nroTarjeta = nroTarjeta;
        this.gasto = gasto;
        String[] fecha = fechaVencimiento.split("/");
        if(fecha[0].startsWith("0")){
            mesVencimiento = Character.getNumericValue(fecha[0].charAt(1));
        } else{
            mesVencimiento = Integer.parseInt(fecha[0]);
        }
        añoVencimiento = Integer.parseInt(fecha[1]);
    }

    public void  calcularTasaEImporte(){
        tasa = marca.calcularTasa(mesVencimiento,añoVencimiento);
        System.out.println("La tasa de operacion es: "+ tasa);
        importe = gasto * tasa;
    }

    public void getInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Numero de Tarjeta: " + nroTarjeta);
        System.out.println("CardHolder: " + cardHolder);
        System.out.println("Fecha vencimiento: " + fechaVencimiento);
    }


    public boolean isValida(){
        return (añoVencimiento >= LocalDate.now().getYear() && mesVencimiento >= LocalDate.now().getMonthValue());
    }
}
