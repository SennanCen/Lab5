import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /** g.*/
        CHECKINGS,
        /** g.*/
        SAVINGS,
        /** g.*/
        STUDENT,
        /** g.*/
        WORKPLACE
    }
    /** g.*/
    private int accountNumber;
    /** g.*/
    private BankAccountType accountType;
    /** g.*/
    private double accountBalance;
    /** g.*/
    private String ownerName;
    /** g.*/
    private double interestRate;
    /** g.*/
    private double interestEarned;

    /**
     * @param name sssss.
     * @param accountCategory ssssssssss.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        accountType = accountCategory;
        ownerName = name;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     *
     * @param setaccountnumber aaa.
     */
    public void setAccountNumber(final int setaccountnumber) {
        accountNumber = setaccountnumber;
    }

    /**
     * @return aaa.
     */
    public int getAccountNumber() {
        return accountNumber;
    }
}
