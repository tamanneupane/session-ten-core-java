package day1.bank;

public class BankAccount {

    //State

    //Account Number (String)
    private String accountNumber;
    //Account Holder Name (String)
    private String accountHolderName;
    //Account Balance (double)
    private double accountBalance;
    //Bank Branch Name (String)
    private String bankBranchName;
    //Branch Code ( int/String )
    private String branchCode;
    //Type of Account (String)
    private String accountType;
    //Interest Rate (float)
    private float interestRate;
    //Customer Information (CustomerInformation)
    private CustomerInformation customerInformation;
    //Social Security Number (String)
    private String socialSecurityNumber;

    // Getters and Setters


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountBalance(double accountBalance) {
        if(accountBalance < 0){
            throw new RuntimeException("Account balance cannot be negative");
        }
        this.accountBalance = accountBalance;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public void setCustomerInformation(CustomerInformation customerInformation) {
        this.customerInformation = customerInformation;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        // gov api
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //Behaviour

    // deposit
    // withdraw
    // checkBalance
    // calculate interest
    // transfer balance
    // create
    // close
    // update information
    // apply credit card

}
