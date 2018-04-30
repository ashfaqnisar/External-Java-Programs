public class BankTestClass {

    public static void main(String[] args){
        BankAccount object = new BankAccount(2339,80000,"Ashfaq");

        System.out.println(object.getAccount());
        System.out.println(object.getBalance());
        System.out.println(object.getAccountName());

        object.setBalance(7694);
        object.creditMoney(849);
        object.debitMoney(5463);

        object.creditMoney(200455);

    }
}
