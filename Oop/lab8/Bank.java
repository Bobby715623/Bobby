
public class Bank {
    private Account acct[];
    private int numAcct;
    
    public Bank(){
        acct = new Account [10];
    }
    public void addAccount(Account ac){
        for(int i=0; i<acct.length; i++){
            acct[i] = ac;
        }
        numAcct++;
    }
    public Account getAccout(int index){
        return acct[index];
    }
    public int getnumAccount(){
        return numAcct;
    }
}
