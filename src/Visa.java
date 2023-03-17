import java.time.LocalDate;

public class Visa extends Tarjeta {

    public Visa(String marca, String nroTarjeta, String cardHolder, String fechaVencimiento){
        super(marca,nroTarjeta,cardHolder,fechaVencimiento);
    }

    @Override
    protected float calcularTasa() {
        tasa = añoVencimiento/mesVencimiento;
        return tasa;
    }
}
