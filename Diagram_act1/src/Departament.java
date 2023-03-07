public class Departament {
    private String name = "";
    private Departament subdepartamento = new Departament(null);
    private Person manager = null;

    public Departament(String Name, String subNameDepartament){
        this.name = Name;
        this.subdepartamento.setName(subNameDepartament);
    }

    public Departament(String Name){
        this.name = Name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departament getSubdepartamento() {
        return subdepartamento;
    }

    public void setSubdepartamento(Departament subdepartamento) {
        this.subdepartamento = subdepartamento;
    }

    public Person getManager() {
        return manager;
    }

    public void setManager(Person manager) {
        this.manager = manager;
    }
    
}
