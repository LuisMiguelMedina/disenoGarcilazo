import java.util.ArrayList;

public class Poligono {
    private ArrayList<Punto> puntos = new ArrayList<>();

    public Poligono(){ }


    public Poligono(Punto _punto){
        this.puntos.add(_punto); 
    }

    public ArrayList<Punto> getPuntos() {
        return puntos;
    }

    public void addPunto(Punto _punto) {
        this.puntos.add(_punto);
    }

    public void printPuntos(){
        int x = 1;
        for (Punto p : puntos) {
            System.out.println("El punto " + x + " se encuentra en: x =" + p.getX() + ", y= " + p.getY());
            x++;
        }
    }

    
}
