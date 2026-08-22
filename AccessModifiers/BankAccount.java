package AccessModifiers;

public class BankAccount {
    private String ownerName;
    private double bankBalence;
    private String email;
    private String phone;
    private String address;

    BankAccount(String ownerName,String email,String phone,String address){
        this.ownerName=ownerName;
        this.email=email;
        this.phone=phone;
        this.address=address;
    }

    BankAccount(BankAccount b){
        this.ownerName=b.ownerName;
        this.email=b.email;
        this.address=b.address;
        this.phone=b.phone;
    }



    public void setBankBalence(double amount){
        this.bankBalence=this.bankBalence+amount;
    }

    public double checkbankBalence(){
        return this.bankBalence;
    }
}
