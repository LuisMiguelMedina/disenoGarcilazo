import java.util.ArrayList;

public class Grupo {
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private Profesor profe;
    private Asignatura asignatura;
    private Reservacion reservacion;
    
    public Grupo(Asignatura asing){
        this.asignatura = asing;
    }

    public void setProfe(Profesor _profe) {
        this.profe = _profe;
    }

    public Profesor getProfe() {
        return profe;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void addAlumno(Alumno alum){
        this.alumnos.add(alum);
    }

}
