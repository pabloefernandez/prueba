import java.time.LocalDate;

public class Nara extends Tarjeta {
    public Nara(String marca, String nroTarjeta, String cardHolder, String fechaVencimiento){
        super(marca,nroTarjeta,cardHolder,fechaVencimiento);
    }

    @Override
    protected float calcularTasa() {
        tasa = LocalDate.now().getDayOfMonth() * 0.5f;
        return tasa;
    }
}
