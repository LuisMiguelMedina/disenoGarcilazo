import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Pais> fronteras = new ArrayList<>();

    public Pais(){ }

    public Pais(String Nombre){
        this.nombre = Nombre;
    }

    public Pais(String Nombre, Pais Frontera){
        this.nombre = Nombre;
        this.fronteras.add(Frontera);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Pais> getFronteras() {
        return fronteras;
    }

    public void addPaisFrontera(Pais Fronteriza){
        this.fronteras.add(Fronteriza);
    }

    
}
