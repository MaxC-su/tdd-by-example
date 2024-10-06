package guru.springframework;

public class Dollar {

    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        amount *= multiplier;
    }

    public void minus(int subtract) {
        amount -= subtract;
    }

    public void plus(int add) {
        amount += add;
    }

    public void divide(int divide) {
        amount /= divide;
    }

}
