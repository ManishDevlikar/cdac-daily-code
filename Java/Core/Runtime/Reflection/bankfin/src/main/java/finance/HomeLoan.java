package finance;

public class HomeLoan {

    public float common(double amount, int period) {
        return amount < 5000000 ? 9 : 8.5f;
    }

    public float woman(double amount, int period) {
        return common(amount, period) - 1;
    }

    public float welfare(double amount, int period) {
        return common(amount, period) / 2;
    }
}
