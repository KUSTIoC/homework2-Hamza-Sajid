class SavingsAccount
{
    static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance)
    {
        savingsBalance = balance;
    }

    public double calculateMonthlyInterest()
    {
        return (savingsBalance*annualInterestRate)/12;
    }

    public static void modifyInterestRate(double rate)
    {
        annualInterestRate = rate;
    }


    public static double getannualInterestRate(){return annualInterestRate;}

    public double getsavingsBalance(){return savingsBalance;}

}
