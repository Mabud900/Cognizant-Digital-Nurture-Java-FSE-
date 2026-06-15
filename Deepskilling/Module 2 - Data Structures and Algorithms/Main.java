public class Main {

    public static double financialForecasting(double principalAmount, int years, double rate) {
        if (years == 0) {
            return principalAmount;
        }

        return financialForecasting(principalAmount, years - 1, rate) * (1 + rate);
    }

    public static void main(String[] args) {
        System.out.println(financialForecasting(20000, 5, 0.10));
    }
}
/*
Time Complexity O(n)
DP Memoization can be applied but there is no overlapping subproblem so no need to memoize it, it is optimized solution
*/