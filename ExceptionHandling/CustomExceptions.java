package ExceptionHandling;

class insufficientFund extends Exception{
    insufficientFund(String msg){
        super(msg);
    }
}
public class CustomExceptions {
    public static void main(String[] args) throws insufficientFund{
        int a=100;
        if(a>1){
            throw new insufficientFund("Found not sufficient");
        }
    }
}
