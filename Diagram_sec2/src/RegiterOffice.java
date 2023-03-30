public class RegiterOffice {
    AccountsReceivable ar;
    Class drama;
    
    
    public RegiterOffice(){ }

    public void init(){
        ar = new AccountsReceivable();
        drama = new Class();
        double balance = ar.getPastDueBalance();

        if(balance == 0){
            drama.addStudent();
        }
    }
}
