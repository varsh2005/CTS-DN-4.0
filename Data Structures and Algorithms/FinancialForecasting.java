public class FinancialForecasting{
    public static double calculateFutureValue(double currentValue, double rate, int years){
        if(years == 0){
            return currentValue;
        }
        return calculateFutureValue(currentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args){
        double currentValue = 1000.0;
        double rate = 0.10;
        int years = 3;
        double futureValue = calculateFutureValue(currentValue, rate, years);
        System.out.println("Predicted Future Value after " + years + " years: " + futureValue);
    }
}
