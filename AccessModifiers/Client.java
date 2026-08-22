package AccessModifiers;

public class Client {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("Ramesh Bankar","ramesh@gamil.com","91","rajajinagar");
        b1.setBankBalence(1000);
        b1.setBankBalence(200);
        System.out.println(b1.checkbankBalence());
//
//        BankAccount b2=new BankAccount(b1);
//        System.out.println(b2.checkbankBalence());

        BankAccount b2=b1;
        System.out.println(b2.checkbankBalence());
        b2.setBankBalence(100);
        System.out.println(b2.checkbankBalence());
        System.out.println(b1.checkbankBalence());



    }
}
