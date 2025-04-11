package feb25.exceptionHandling;

// Step 1: Define the custom exceptions
class InvalidAmountError extends Exception {
    public InvalidAmountError(String message) {
        super(message);
    }
}

class SavingsAccountInsufficientFunds extends Exception {
    public SavingsAccountInsufficientFunds(String message) {
        super(message);
    }
}

class CheckingAccountOverdraftError extends Exception {
    public CheckingAccountOverdraftError(String message) {
        super(message);
    }
}

// Step 2: Create the base class BankAccount
abstract class BankAccount {
    double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) throws InvalidAmountError {
        if (amount < 0) {
            throw new InvalidAmountError("Deposit amount cannot be negative.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    // Method to withdraw money, which will be overridden in subclasses
    public abstract void withdraw(double amount) throws Exception;

    public double getBalance() {
        return balance;
    }
}

// Step 3: Create SavingsAccount subclass
class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) throws SavingsAccountInsufficientFunds, InvalidAmountError {
        if (amount < 0) {
            throw new InvalidAmountError("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new SavingsAccountInsufficientFunds("Insufficient funds in SavingsAccount.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
    }
}

// Step 4: Create CheckingAccount subclass
class CheckingAccount extends BankAccount {

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) throws CheckingAccountOverdraftError, InvalidAmountError {
        if (amount < 0) {
            throw new InvalidAmountError("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new CheckingAccountOverdraftError("Insufficient funds for overdraft protection.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
    }
}

// Step 5: Test the BankAccount system
public class ExceptionHierarchy {
    public static void main(String[] args) {
        // Creating a SavingsAccount and CheckingAccount
        BankAccount savings = new SavingsAccount(400);
        System.out.println("savings");
        BankAccount checking = new CheckingAccount(500);

        // Test Deposits and Withdrawals
        try {
            savings.deposit(0);
            savings.withdraw(200);
            // Will trigger SavingsAccountInsufficientFunds exception
        } catch (InvalidAmountError | SavingsAccountInsufficientFunds e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("-------------------------------------");

        try {
            checking.deposit(100);
            checking.withdraw(600);
            // Will trigger CheckingAccountOverdraftError exception
        } catch (InvalidAmountError | CheckingAccountOverdraftError e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
