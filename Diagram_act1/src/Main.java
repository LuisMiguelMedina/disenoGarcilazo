public class Main {

    public static void main(String[] args) {
        //Hecho en clase y guiado por el profe
        Company c = new Company();
        Departament d1 = new Departament("Sales");
        Departament d2 = new Departament("R&D");
        Departament d3 = new Departament("US Sales");
        
        c.newDepartament(d1);
        c.newDepartament(d2);
        d1.setSubdepartamento(d3);
        
        Person p = new Person();
        
        p.setName("Erin");
        p.setEmployeeID(4362);
        p.setTitle("VIP of Sales");
        d3.setManager(p);

        ContactInformation contactInfo = new ContactInformation();
        contactInfo.setAdress("1472 Miller St.");
        p.setInfo(contactInfo); 
    }
    
}
