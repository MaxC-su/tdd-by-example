package guru.springframework;

import lombok.Getter;

@Getter
public class Frank extends Currency {

    public Frank(int amount) {
        this.amount = amount;
    }

    public Frank times(int multiplier) {
        return new Frank(amount * multiplier);
    }

    public Frank minus(int subtract) {
        return new Frank(amount - subtract);
    }

    public Frank plus(int add) {
        return new Frank(amount + add);
    }

    public Frank divide(int divide) {
        return new Frank(amount / divide);
    }

}
