public class Main {
    public static void main(String[] args) throws Exception {
        Alumno a1 = new Alumno();
        Profesor p1 = new Profesor();
        Profesor p2 = new Profesor();
        Asignatura asing1 = new Asignatura();
        Asignatura asing2 = new Asignatura();
        Grupo g1 = new Grupo(asing1);
        Grupo g2 = new Grupo(asing2);
        Sala s1 = new Sala();

        a1.addGrupo(g1);
        a1.addGrupo(g2);

        g1.setProfe(p1);
        Reservacion r1 = new Reservacion(g1);
        g1.setReservacion(r1);
        r1.setSala(s1);

        g2.setProfe(p2);
        Reservacion r2 = new Reservacion(g2);
        g2.setReservacion(r2);
        r2.setSala(s1);
    }
}
