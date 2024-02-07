import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test
    void canGetFirstName(){
        BankAccount account = new BankAccount(
                "James", "May", "01-01-2000", 12345, "Current Account", 0);
        String firstName = account.getFirstName();
        assertThat(firstName).isEqualTo("James");

    }
    @Test
    void canSetFirstName(){
        BankAccount account = new BankAccount(
                "James", "May", "01-01-2000", 12345, "Current Account", 0);
        account.setFirstName("Harry");
        String firstName = account.getFirstName();
        assertThat(firstName).isEqualTo("Harry");

    }
    @Test
    void canGetLastName(){
        BankAccount account = new BankAccount(
                "James", "May", "01-01-2000", 12345, "Current Account", 0);
        String lastName = account.getLastName();
        assertThat(lastName).isEqualTo("May");

    }
    @Test
    void canSetLastName(){
        BankAccount account = new BankAccount(
                "James", "May", "01-01-2000", 12345, "Current Account", 0);
        account.setLastName("Harrison");
        String lastName = account.getLastName();
        assertThat(lastName).isEqualTo("Harrison");

    }
    @Test
    void canGetDateOfBirth(){
        BankAccount account = new BankAccount(
                "James", "May", "01-01-2000", 12345, "Current Account", 0);
        String getDateOfBirth = account.getDateOfBirth();
        assertThat(getDateOfBirth).isEqualTo("01-01-2000");

    }
    @Test
    void canSetDateOfBirth(){
        BankAccount account = new BankAccount(
                "James", "May", "01-01-2000", 12345, "Current Account", 0);
        account.setDateOfBirth("01-01-1990");
        String DateOfBirth = account.getDateOfBirth();
        assertThat(DateOfBirth).isEqualTo("01-01-1990");

    }
    @Test
    void canGetAccountNumber(){
        BankAccount account = new BankAccount(
                "James", "May", "01-01-2000", 12345, "Current Account", 0);
        int accountNumber = account.getAccountNumber();
        assertThat(accountNumber).isEqualTo(12345);

    }
    @Test
    void canSetAccountNumber(){
        BankAccount account = new BankAccount(
                "James", "May", "01-01-2000", 12345, "Current Account", 0);
        account.setAccountNumber(54321);
        int AccountNumber = account.getAccountNumber();
        assertThat(AccountNumber).isEqualTo(54321);

    }
    @Test
    void canGetBalance(){
        BankAccount account = new BankAccount(
                "James", "May", "01-01-2000", 12345, "Current Account", 0);
        int balance = account.getBalance();
        assertThat(balance).isEqualTo(1000);

    }
    @Test
    void canSetBalance(){
        BankAccount account = new BankAccount(
                "James", "May", "01-01-2000", 12345, "Current Account", 0);
        account.setBalance(0);
        int balance = account.getBalance();
        assertThat(balance).isEqualTo(0);

    }
    @Test
    void checkDeposit(){
        BankAccount account = new BankAccount(
                "James", "May", "01-01-2000", 12345, "Current Account", 0);
        account.deposit(1000);
        int newBalance = account.getBalance();
        assertThat(newBalance).isEqualTo(2000);

    }
    @Test
    void checkWithdraw(){
        BankAccount account = new BankAccount(
                "James", "May", "01-01-2000", 12345, "Current Account", 0);
        account.withdraw(1000);
        int newBalance = account.getBalance();
        assertThat(newBalance).isEqualTo(0);

    }
}

