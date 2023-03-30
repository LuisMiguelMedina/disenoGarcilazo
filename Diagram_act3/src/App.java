
public class App {
    public static void main(String[] args) throws Exception {
        Poligono p1 = new Poligono();

        Punto pt1 = new Punto(-5,5);
        Punto pt2 = new Punto(-5,-5);
        Punto pt3 = new Punto(5,-5);
        Punto pt4 = new Punto(5,5);

        p1.addPunto(pt1);
        p1.addPunto(pt2);
        p1.addPunto(pt3);
        p1.addPunto(pt4);

        p1.printPuntos();

    }
}