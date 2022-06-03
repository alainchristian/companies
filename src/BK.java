public class BK extends Company {
    float interestRate(){
        return 0.1f;
    }
    int minDuration(){
        return 3;
    }
    String accNumber;
    String accName;
    float balance;

    public BK(String accNumber, String accName, float balance) {
        this.accNumber = accNumber;
        this.accName = accName;
        this.balance = balance;
    }

    public BK() {
    }

    @Override
    public String toString() {
        return accNumber+"\t"+accName+"\t"+balance;
    }
}
