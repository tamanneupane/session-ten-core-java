package day1.bank;

public class BankingApplication {

    public static void main(String[] args) {
        BankAccount tamanAccount = new BankAccount();
//        tamanAccount.accountNumber = "47856";
        tamanAccount.setAccountNumber("47856");

//        String accountNumber = tamanAccount.accountNumber;
        String accountNumber = tamanAccount.getAccountNumber();

//        tamanAccount.accountHolderName = "Taman Neupane";
        tamanAccount.setAccountHolderName("Taman Neupane");

//        tamanAccount.accountBalance = -4000;
        tamanAccount.setAccountBalance(-4000);

//        tamanAccount.accountType = "SAVING";
        tamanAccount.setAccountType("SAVING");

//        tamanAccount.bankBranchName = "Baneshwor Branch";
        tamanAccount.setBankBranchName("Baneshwor Branch");

//        tamanAccount.branchCode = "10";
        tamanAccount.setBranchCode("10");

//        tamanAccount.interestRate = 8;
        tamanAccount.setInterestRate(8f);

//        tamanAccount.socialSecurityNumber = "123456789";
        tamanAccount.setSocialSecurityNumber("123456789");

        CustomerInformation tamanInformation = new CustomerInformation();
        tamanInformation.phoneNumber = "9851184633";


//        tamanAccount.customerInformation = tamanInformation;
        tamanAccount.setCustomerInformation(tamanInformation);

//        BankAccount personBAccount = new BankAccount();
//        personBAccount.accountNumber = "12345";
    }
}
