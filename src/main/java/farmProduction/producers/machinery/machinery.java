package farmProduction.producers.machinery;

import lombok.Getter;
import lombok.Setter;

public abstract class machinery {
    @Getter @Setter private float costPerTurn;
    @Getter @Setter private float price;
}