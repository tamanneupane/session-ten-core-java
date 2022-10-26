package day2;

public class FunctionPractice {

    public static void main(String[] args) {
        long principal = 500000;
        float rate = 11.03f; // Yearly
        int time = 3; // months

        double calculatedInterest = calculateInterest(principal, rate, time);
        bankTransaction(calculatedInterest, 1);
        System.out.println(calculatedInterest);

        principal = 600000;
        rate = 11.04f; // Yearly
        time = 6; // months

        calculatedInterest = calculateInterest(principal, rate, time);
        bankTransaction(calculatedInterest, 1);
        System.out.println(calculatedInterest);

        principal = 700000;
        rate = 11.03f; // Yearly
        time = 12; // months

        calculatedInterest = calculateInterest(principal, rate, time);
        bankTransaction(calculatedInterest, 1);
        System.out.println(calculatedInterest);
    }

    static double calculateInterest(long p, float r, int t){
        float timeInYear = t / 12f;
        return (p * r * timeInYear) / 100;
    }

    // purpose 1 = Deposit , 2 = withdraw
    static void bankTransaction(double amount, int purpose){
        if(purpose == 1){
            deposit(amount);
        }else{
            withdraw(amount);
        }
    }


    static void deposit(double interest){
        // code to deposit interest in your bank account
    }

    static void withdraw(double loan){
        // code to deposit interest in your bank account
    }

}
