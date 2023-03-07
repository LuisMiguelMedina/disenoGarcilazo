public class Person {
    private String name = "";
    private int employeeID = 0000;
    private String title = "";
    private ContactInformation  info = null;
    
    public Person(String Name, int EmployeeID, String Title){
        this.name = Name;
        this.employeeID = EmployeeID;
        this.title = Title;

    }

    public Person(String Name, int EmployeeID, String Title, ContactInformation Info){
        this.name = Name;
        this.employeeID = EmployeeID;
        this.title = Title;
        this.info = Info;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ContactInformation getInfo() {
        return info;
    }

    public void setInfo(ContactInformation info) {
        this.info = info;
    }

    
}
