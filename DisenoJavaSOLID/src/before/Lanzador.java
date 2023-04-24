package before;

public class Lanzador {
    public void draw(Vechicle vechicle){
        switch (vechicle.getType()) {
            case CAR -> drawCar(vechicle);
            case Motorbike -> drawMotorbike(vechicle);
        }
    }
    private void drawCar(Vechicle vechicle){
        System.out.println(vechicle);
    }
    private void drawMotorbike(Vechicle vechicle){
        System.out.println(vechicle);
    }
    public static void main(String[] args) {
        Lanzador lanzador = new Lanzador();
        lanzador.draw(new Vechicle(VehicleType.CAR));
    }
}