package scenarios.salarycalculator;

public class SalaryCalculator {

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold < 20 ? 10 : 13;
    }

    public double bonusForProductsSold (int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary (int daysSkipped, int productsSold) {
        double finalSalary = 1000.0 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        
        if (finalSalary > 2000.0) {
            return 2000.0;
        }

        return finalSalary;
    }
}
