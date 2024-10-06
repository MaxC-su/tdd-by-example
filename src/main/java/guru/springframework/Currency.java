package guru.springframework;

import lombok.Getter;

@Getter
public class Currency {

    protected int amount;

    public boolean equals(Object object) {
        Currency money = (Currency) object;
        return amount == money.amount;
    }

}
