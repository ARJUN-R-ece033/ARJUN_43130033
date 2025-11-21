package nov21;

public class EnCap {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(5000);
        System.out.println(acc.getBalance());
    }
}
class Account {
    private int balance;

    public void setBalance(int b) {
        balance = b;
    }
    public int getBalance() {
        return balance;
    }
}