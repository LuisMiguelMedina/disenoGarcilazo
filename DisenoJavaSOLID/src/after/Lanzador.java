package after;

public class Lanzador {
    public void draw(Vehicle vehicle){
        executeDraw(vehicle);
    }
    private void executeDraw(Vehicle vehicle){
        System.out.println(vehicle.to_String());
    }
    public static void main(String[] args) {
        Lanzador lanzador = new Lanzador();
        Vehicle car = new Car();
        lanzador.draw(car);
    }
}