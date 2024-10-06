package guru.springframework;

import lombok.Getter;

@Getter
public class Dollar extends Currency {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public Dollar minus(int subtract) {
        return new Dollar(amount - subtract);
    }

    public Dollar plus(int add) {
        return new Dollar(amount + add);
    }

    public Dollar divide(int divide) {
        return new Dollar(amount / divide);
    }



}
