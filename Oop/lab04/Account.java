
public class Account {
    public double balance;
    public String name;
    
    public void deposit(double b){
        if (b >= 0){
        balance = balance + b;
    }else{
                System.out.println("The balance variable must be greater than or equal to zero.");}
    }
    public double withdraw(double b){
        if (balance < b){
            System.out.println("Your account balance is insufficient.");
            return balance;
        }if (b >= 0){
            balance = balance - b;
            return balance;
        }else{
            System.out.println("The balance variable must be greater than or equal to zero");
            return b = 0;
        }
    }
    public void showInfo(){
        System.out.println("In "+name+" account, there is a balance equal to "+balance+" baht.");
    }
}
