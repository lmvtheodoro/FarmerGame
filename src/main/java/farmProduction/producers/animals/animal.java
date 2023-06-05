package farmProduction.producers.animals;

import lombok.Getter;
import lombok.Setter;

public abstract class animal {
    @Getter @Setter protected String specie;
    @Getter @Setter protected String name;
    @Getter @Setter protected int age;
    @Getter @Setter protected int lifeExpectancy;
    @Getter @Setter protected String gender;
    @Getter @Setter private float weight;
    @Getter @Setter private String situation;
    @Getter @Setter private float price;
    @Getter @Setter private float costPerTurn;

    protected animal() {
        // Protected constructor to avoid instantiation
    }

    public abstract float meatProduction();
}