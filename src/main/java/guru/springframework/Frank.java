package guru.springframework;

import lombok.Getter;

@Getter
public class Frank {

    private final int amount;

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

    public boolean equals(Object object) {
        Frank frank = (Frank) object;
        return amount == frank.amount;
    }
}
