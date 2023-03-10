public class App {
    public static void main(String[] args) throws Exception {
        Pais p1 = new Pais("Espana");
        Pais p2 = new Pais("Francia");
        Pais p3 = new Pais("Italia");
        // Frontera de Espana
        p1.addPaisFrontera(p2);

        //fronteras de frencia
        p2.addPaisFrontera(p1);
        p2.addPaisFrontera(p3);

        //Fronteras de Italia
        p3.addPaisFrontera(p2);

        //Cambiar el pais para ver sus fronteras
        System.out.println("Las fronteras de " + p2.getNombre() + " son:");
        for (Pais pais : p2.getFronteras()) {
            System.out.print(pais.getNombre() + " ");
        }
    }
}
