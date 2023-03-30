public class Reservacion {
    private Grupo grupo;
    private Sala sala;

    public Reservacion(Grupo _grupo){
        this.grupo = _grupo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Sala getSala() {
        return sala;
    }

}
