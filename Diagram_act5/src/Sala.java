import java.util.ArrayList;

public class Sala {
    ArrayList<Reservacion> reservaciones = new ArrayList<>();

    public Sala(){}

    public void addReservacion(Reservacion _reservacion){
        this.reservaciones.add(_reservacion);
    }
    
}