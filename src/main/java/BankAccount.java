public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;
    private String accountType;
    private int overdraft;

    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber, String accountType, int overdraft) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 1000;
        this.accountType = accountType;
        this.overdraft = overdraft;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String setFirstName) {
        this.firstName = setFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String setLastName) {
        this.lastName = setLastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String setDateOfBirth) {
        this.dateOfBirth = setDateOfBirth;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int setBalance) {
        this.balance = setBalance;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public void withdraw(int amount){
        this.balance -= amount;
    }

    public void interest(){
        this.balance += (int) (this.balance * 0.02);
    }

    public void accountType(){
        this.accountType = accountType;
    }

    public void overdraft(){
        this.overdraft = balance - overdraft;
    }
}

