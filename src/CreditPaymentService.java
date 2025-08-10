public class CreditPaymentService {
    public double calculate(double principal, double annualInterestRate, int periodInMonths) {

        double monthlyInterestRate = annualInterestRate / 100 / 12;

        double coefficient = Math.pow((1 + monthlyInterestRate), periodInMonths);
        double payment = (principal * monthlyInterestRate * coefficient) / (coefficient - 1);

        return payment;
    }
}
