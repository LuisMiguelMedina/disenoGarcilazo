public class ContactInformation {
    private String address = null;

    public ContactInformation(){

    }

    public ContactInformation(String Address){
        this.address = Address;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String Address) {
        this.address = Address;
    }
}
