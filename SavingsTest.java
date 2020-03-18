public class SavingTest
{
    public static void main(String args[])
    {
        SavingsAccount saver1 = new SavingsAccount(5000.0);
        SavingsAccount saver2 = new SavingsAccount(5000.0);

        SavingsAccount.modifyInterestRate(4);

        System.out.printf("Balance for Saver1 = %.2f\nBalance (with itr) for Saver1 = %.2f\nInterest Rate = %.2f\n\n",saver1.getsavingsBalance(),saver1.getsavingsBalance()+saver1.calculateMonthlyInterest(),SavingsAccount.getannualInterestRate());

        SavingsAccount.modifyInterestRate(5);

        System.out.printf("Balance for Saver2 = %.2f\nBalance (with itr) for Saver2 = %.2f\nInterest Rate = %.2f\n\n",saver2.getsavingsBalance(),saver2.getsavingsBalance()+saver2.calculateMonthlyInterest(),SavingsAccount.getannualInterestRate());
    }
}