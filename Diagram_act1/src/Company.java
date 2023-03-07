import java.util.ArrayList;

public class Company {
    private ArrayList <Departament> Departamentos = new ArrayList<>();

    public Company(){}

    public Company(String NameDepartarment){
        Departament Nuevo = new Departament(NameDepartarment);
        Departamentos.add(Nuevo);
    }

    public ArrayList<Departament> getDepartamentos() {
        return Departamentos;
    }

    public void newDepartament(Departament newDepartament){
        Departamentos.add(newDepartament);
    }

}
