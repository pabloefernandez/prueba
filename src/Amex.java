import java.time.LocalDate;

public class Amex extends Tarjeta{
    public Amex(String marca, String nroTarjeta, String cardHolder, String fechaVencimiento){
        super(marca,nroTarjeta,cardHolder,fechaVencimiento);
    }

    @Override
    protected float calcularTasa() {
        tasa = mesVencimiento * 0.1f;
        return tasa;
    }
}
