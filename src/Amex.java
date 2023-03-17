import java.time.LocalDate;

public class Amex extends Marca{
    public Amex(){
        nombre = "Amex";
    }

    @Override
    protected float calcularTasa(int mes,int año) {
        tasa = mes * 0.1f;
        return tasa;
    }
}
