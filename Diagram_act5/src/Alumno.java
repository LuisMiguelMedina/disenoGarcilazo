import java.util.ArrayList;

public class Alumno {
    ArrayList<Grupo> grupos = new ArrayList<>();

    public Alumno(){}

    public void addGrupo(Grupo _grupo){
        this.grupos.add(_grupo);
    }

    
}
