package JAVA;

public class example1 {

    public static double dollarToPesos(double dollars) {
        double exchangeRate = 51.50;
        return dollars * exchangeRate;
    }

    public static void main(String[] args) {
        double amountInDollars = 100;
        double amountInPesos = dollarToPesos(amountInDollars);
        System.out.printf("%.2f dollars is equal to %.2f pesos.%n", amountInDollars, amountInPesos);
    }

}
