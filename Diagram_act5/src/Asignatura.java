import java.util.ArrayList;

public class Asignatura {
    ArrayList<Grupo> grupos = new ArrayList<>();
    public Asignatura(){}

    public void addGrupo(Grupo _grupo){
        this.grupos.add(_grupo);
    }    
}
