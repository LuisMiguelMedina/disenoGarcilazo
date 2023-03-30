import java.util.ArrayList;

public class ImparticionAsignatura {
    private Asignatura asignaturas;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;

    public ImparticionAsignatura(){}

    public void setAsignaturas(Asignatura asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Asignatura getAsignaturas() {
        return asignaturas;
    }
    


    public void addEstudiante(Estudiante _estudiante){
        this.estudiantes.add(_estudiante);
    }

    public void addProfesor(Profesor _profesor){
        this.profesores.add(_profesor);
    }

    public void printEstudiantes(){
        int x = 1;
        for (Estudiante e : estudiantes) {
            System.out.println(x + ".- " + e.getNombre());
            x++;
        }
    }

    public void printProfesor(){
        int x = 1;
        for (Profesor p : profesores) {
            System.out.println(x + ".- " + p.getNombre());
            x++;
        }
    }
}
