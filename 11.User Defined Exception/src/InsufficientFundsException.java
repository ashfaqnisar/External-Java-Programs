public class InsufficientFundsException extends Exception {

    public InsufficientFundsException(double amount){
        System.err.println("Less Balance By" + amount);
    }
}
