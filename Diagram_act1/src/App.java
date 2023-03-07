public class App {
    public static void main(String[] args) throws Exception {

        //Intento fallido, no corras este
        Company compania = new Company("Sales");
        compania.newDepartament("R&D");
        for (Departament Depa : compania.getDepartamentos()) {

            if(Depa.getName() == "Sales"){
                Depa.setSubdepartamento(new Departament("US Sales"));
                Depa.getSubdepartamento().setManager(new Person("Erin", 4362, "VIP of Sales", new ContactInformation("1472 Miller St.")));
            }
        }

        System.out.println(compania);
        
    }
}
