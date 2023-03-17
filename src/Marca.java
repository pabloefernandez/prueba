public abstract class Marca {
    protected String nombre;
    protected float tasa;
    public Marca(){

    }

    protected abstract float calcularTasa(int mes,int año);

    public String getNombre() {
        return nombre;
    }
}
