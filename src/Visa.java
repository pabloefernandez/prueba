import java.time.LocalDate;

public class Visa extends Marca {

    public Visa(){
        nombre = "Visa";
    }

    @Override
    protected float calcularTasa(int mes,int año) {
        tasa = año/mes;
        return tasa;
    }
}
