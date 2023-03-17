import java.time.LocalDate;

public class Nara extends Marca {
    public Nara(){
       nombre = "Nara";
    }

    @Override
    protected float calcularTasa(int mes,int año) {
        tasa = LocalDate.now().getDayOfMonth() * 0.5f;
        return tasa;
    }
}
