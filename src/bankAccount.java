public class bankAccount {
    public int accountNumber;
    public double balance;

    public bankAccount(int accountNumber, double balance){
        this.accountNumber= accountNumber;
        this.balance= balance;
    }
    public void deposit(double amount){
        balance+= amount;
    }
    public void withdraw(double amount){
        balance-= amount;
    }
    public void displayBalance(){
        System.out.println("Your balace is: "+ balance + "MAD");
    }


    public static void main(String[] args){

        bankAccount account1= new bankAccount(26878546, 500);
        account1.deposit(100);
        account1.withdraw(200);
        account1.displayBalance();
    }

}
