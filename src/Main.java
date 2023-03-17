import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Tarjeta visa = new Tarjeta(new Visa(),"12312313212332123","Pablo Fernandez","01/24",500);
        Tarjeta amex = new Tarjeta(new Amex(),"1313131313131","Pablo Fernandez","02/24",1000);
        Tarjeta nara = new Tarjeta(new Nara(),"123131312313212332123","Pablo Fernandez","03/24",300);
        if(visa.getImporte() >= 1000){
            System.out.println("La operacion no es valida");
        }
        if(visa.isValida()){
            System.out.println("La tarjeta es valida para operar");
        }

    }
}