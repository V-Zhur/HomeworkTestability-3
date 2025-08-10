public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double principal1 = 1_000_000;
        double rate1 = 9.99;
        int period1 = 12;
        double payment1 = service.calculate(principal1, rate1, period1);
        System.out.println("Пример 1: платёж = " + payment1);

        double principal2 = 1_000_000;
        double rate2 = 9.99;
        int period2 = 24;
        double payment2 = service.calculate(principal2, rate2, period2);
        System.out.println("Пример 2: платёж = " + payment2);

        double principal3 = 1_000_000;
        double rate3 = 9.99;
        int period3 = 36;
        double payment3 = service.calculate(principal3, rate3, period3);
        System.out.println("Пример 3: платёж = " + payment3);
    }
}
